package ex0724.board;

public class QABoardServiceImpl implements BoardService 
{

	@Override
	public int insert(Board board) 
	{	System.out.println("QA :" + board);
		System.out.println(super.getClass().getSimpleName()+"의 등록입니다.");
		return 1;
	}

	@Override
	public boolean update(Board board) 
	{	System.out.println("QA :" + board);
		System.out.println(super.getClass().getSimpleName()+"의 수정입니다.");
		
		return false;
	}

	@Override
	public Board selectByBno(int bno) 
	{	
		System.out.println(super.getClass().getSimpleName()+"의 상세보기 입니다.");
		
		return new QABoard(10,"interface학습","희정","재미있다.",false);
	}
	
	public void delete() 
	{
		System.out.println("QA Board의 삭제입니다.");

	}
}
