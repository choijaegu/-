package app.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.mvc.common.DBManager;
import app.mvc.dto.BoardDTO;
import app.mvc.dto.ReplyDTO;
import app.mvc.exception.DMLException;
import app.mvc.exception.SearchWrongException;

public class BoardDAOImpl implements BoardDAO {
	
	private static BoardDAO instance = new BoardDAOImpl();
	
	private BoardDAOImpl() {}
	
	public static BoardDAO getInstance() {
		return instance;
	}
	

	@Override
	public List<BoardDTO> boardSelectAll() throws SearchWrongException {
		Connection con=null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		List<BoardDTO> list = new ArrayList<>();
		String sql="select * from board order by board_no desc";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
			{
				int boardNo = rs.getInt(1);
				String subject = rs.getString(2);
				String writer = rs.getString(3);
				String content = rs.getString(4);
				String boardDate = rs.getString(5);
				
				list.add(new BoardDTO(boardNo,subject,writer,content,boardDate));
				
			}
			
			
			
		}catch (SQLException e) {
			e.printStackTrace();
			throw new SearchWrongException("DB에 문제가 있어 다시 진행해주요^^");
			
		}finally {
			DBManager.dbClose(con, ps, rs);
		}			
				
		
		return list;
	}
	
	//컬럼명들만 빼내오는 작업은 rs.getMetaData(); 대신 next()가 들어가기전에해야함.
	/**
	 * ResultSetMetaData rsm = rs.getMetaData();
	 */
	@Override
	public List<BoardDTO> boardSelectBySubject(String keyWord) throws SearchWrongException 
	{	
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<BoardDTO>list = new ArrayList<BoardDTO>();
		String sql = "select * from board where subject like ?";
		
		try
		{
		con = DBManager.getConnection();
		ps = con.prepareStatement(sql);
		ps.setString(1, "%"+keyWord+"%");
		rs = ps.executeQuery();
		
		while(rs.next())
		{
			int boardNo = rs.getInt(1);
			String subject = rs.getString(2);
			String writer = rs.getString(3);
			String content = rs.getString(4);
			String boardDate = rs.getString(5);
			
			list.add(new BoardDTO(boardNo,subject,writer,content,boardDate));
			
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new SearchWrongException("DB에 문제가 있어 다시 진행해주요^^");
		}
		finally
		{
			DBManager.dbClose(con, ps, rs);
		}
		
		return list;
	}
	
	/**
	 * 글번호에 해당하는 레코드 검색 - pk를 대상으로 조건 ( 레코드수가 0 아니면 1)
	 * select * from board where board_no = ? 
	 */
	@Override
	public BoardDTO boardSelectByNo(int boardNo) throws SearchWrongException 
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardDTO board = null;
		String sql = "select * from board where board_no = ?";
		
		try
		{
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardNo);
			rs = ps.executeQuery();
			
		if(rs.next())
		{
			int boardNum = rs.getInt(1);
			String subject = rs.getString(2);
			String writer = rs.getString(3);
			String content = rs.getString(4);
			String boardDate = rs.getString(5);
			
			board = new BoardDTO(boardNum,subject,writer,content,boardDate);
			
			return board;
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new SearchWrongException(e.getMessage());
		}
		finally
		{
			DBManager.dbClose(con, ps, rs);
		}
		return null;
	}
	
	/**
	 * 게시물 등록하기
	 * insert into board (board_no, subject, writer, content, board_date) 
	 * values (board_seq.nextval, ?, ?, ?, sysdate)
	 */
	
	@Override
	public int boardInsert(BoardDTO boardDTO) throws DMLException 
	{	
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into board (board_no, subject, writer, content, board_date)"
				+ "values (board_seq.nextval, ?, ?, ?, sysdate)";
		int result = 0;
		
		try
		{
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, boardDTO.getSubject());
			ps.setString(2, boardDTO.getWriter());
			ps.setString(3, boardDTO.getContent());
			
			result = ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new DMLException("DB에 문제가 있어 다시 진행해주요^^");
		}
		finally
		{
			DBManager.dbClose(con, ps);
		}
		
		
		
		return result;
	}
	
	/**
	 * 글번호에 해당하는 게시물 내용 수정하기
	 * update board set content = ? where board_no = ?
	 */
	
	@Override
	public int boardUpdate(BoardDTO boardDTO) throws DMLException 
	{
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "update board set content = ? where board_no = ?";
		int result = 0;
		
		try
		{
		con = DBManager.getConnection();
		ps = con.prepareStatement(sql);
		ps.setString(1, boardDTO.getContent());
		ps.setInt(2, boardDTO.getBoardNo());
		
		result = ps.executeUpdate();
		
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new DMLException("DB에 문제가 있어 다시 진행해주요^^");
		}
		finally
		{
			DBManager.dbClose(con, ps);
		}
		
		return result;
	}
	
	/**
	 * 글번호에 해당하는 레코드 삭제
	 * delete from board where board_no = ?
	 */
	
	@Override
	public int boardDelete(int boardNo) throws DMLException 
	{
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "delete from board where board_no = ?";
		int result = 0;
		
		try
		{
		con = DBManager.getConnection();
		ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		
		
		result = ps.executeUpdate();
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new DMLException("DB에 문제가 있어 다시 진행해주요^^");
		}
		finally
		{
			DBManager.dbClose(con, ps, null);
		}
		
		
		return result;
	}
	
	/**
	 * 댓글 등록하기
	 *  insert into reply values(reply_no_seq.nextval , ?, ? , sysdate)
	 * */
	@Override
	public int replyInsert(ReplyDTO replyDTO) throws DMLException 
	{
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into reply values(reply_no_seq.nextval , ?, ? , sysdate)";
		
		try
		{
		con = DBManager.getConnection();
		ps = con.prepareStatement(sql);
		ps.setString(1, replyDTO.getReplyContent());
		ps.setInt(2, replyDTO.getBoardNo());
		
		result = ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new DMLException("DB에 문제가 있어 다시 진행해주요^^");
		}
		finally
		{
			DBManager.dbClose(con, ps);
		}
		
		
		return result;
	}
	
	/**
	 * 부모글에 해당하는 댓글정보 검색하기
	 *   select * from board where board_no=?  -> 1
	 *   select * from reply where board_no=? -> n
	 */  
	@Override
	public BoardDTO replySelectByParentNo(int boardNo) throws SearchWrongException 
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardDTO board = null;
		
		String sql = "select * from board where board_no=?";
		
		
		try
		{
		con = DBManager.getConnection();
		ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		rs = ps.executeQuery();
		List <ReplyDTO>list = getReplyList(con,boardNo);
		if(rs.next())
		{
			int boardNum = rs.getInt(1);
			String subject = rs.getString(2);
			String writer = rs.getString(3);
			String content = rs.getString(4);
			String boardDate = rs.getString(5);
			
			board = new BoardDTO(boardNum,subject,writer,
							 content,boardDate);
			
			board.setRepliesList(list);
			
		}
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new SearchWrongException("DB에 문제가 있어 다시 진행해주요^^");
		}
		finally
		{
			DBManager.dbClose(con, ps, rs);
		}
		
		return board;
	}
	
	private List<ReplyDTO> getReplyList(Connection con,int boardNo) throws SearchWrongException
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from reply where board_no=?";
		List <ReplyDTO>list = new ArrayList<ReplyDTO>();
		
		try
		{
		
		ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		rs = ps.executeQuery();
		
		while(rs.next())
		{
			int replyNo = rs.getInt(1);
			String replyContent = rs.getString(2);
			int boardNum = rs.getInt(3);
			String replyRegdate  = rs.getString(4);
			
			list.add(new ReplyDTO(replyNo,replyContent,
								boardNum,replyRegdate));
	
		}
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new SearchWrongException("DB에 문제가 있어 다시 진행해주요^^");
		}
		finally
		{
			DBManager.dbClose(null, ps, rs);
		}
		return list;
	}
	
	/***
	 * 부모글에 해당하는 댓글정보 가져오기
	 * 
	 * *   
	 *   조인경우 : select * from board join reply using(board_no)  where board_no=?
	 * */
	@Override
	public List<BoardDTO> replySelectByParentNo2() throws SearchWrongException
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardDTO board = null;
		List <ReplyDTO>list = new ArrayList<ReplyDTO>();
		List <BoardDTO>list2 = new ArrayList<BoardDTO>();
		String sql = "select * from board join reply using(board_no) order by boardNo";
		
		
		try
		{
		con = DBManager.getConnection();
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		
		
		while(rs.next())
		{
			int boardNum = rs.getInt(1);
			String subject = rs.getString(2);
			String writer = rs.getString(3);
			String content = rs.getString(4);
			String boardDate = rs.getString(5);
			int replyNo = rs.getInt(6);
			String replyContent = rs.getString(7);
			String replyRegdate = rs.getString(8);
			
			board = new BoardDTO(boardNum,subject,writer,content,boardDate);
			
			
			list.add(new ReplyDTO(replyNo,replyContent,boardNum,replyRegdate));
			
			board.setRepliesList(list);
			list2.add(board);
			
		}
		
		
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new SearchWrongException("db에 문제있음");
		}
		finally
		{
			DBManager.dbClose(con, ps, rs);
		}
		
		
		return list2;
		
				
	}
	
}













