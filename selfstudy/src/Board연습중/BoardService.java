package Board연습중;

public interface BoardService 
{

	/**
	 * 등록하기
	 * @return: 0이면 실패, 1이상 성공
	 * @param: Board 객체
	 * 
	 */
	int insert(Board board);
	
	
	/**
	 * 수정하기
	 * :글번호에 해당하는 제목, 내용 수정한다.
	 * 	new FreeBoard(글번호,제목,내용)
	 * 	new QABoard(글번호, 제목, 내용)
	 * 	new UploadBoard(글번호, 제목, 내용)
	 * 
	 * @return: boolean형(true이면 수정성공, false이면 수정실패)
	 * @param: Board 객체
	 */
	boolean update(Board board);
	
	/**
	 * 글번호에 해당하는 게시물 조회=검색
	 * @return: 없으면 null, 있으면 Board객체
	 * @param: int
	 */
	Board selectByBno(int bno);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
