package Board연습중;

public class QABoardServiceImpl implements BoardService 
{

	@Override
	public int insert(Board board)
	{
		System.out.println("QA :"+board);
		System.out.println(getClass().getSimpleName()+"의 insert입니다.");

		return 1;
	}

	@Override
	public boolean update(Board board) 
	{	
		System.out.println("QA :"+board);
		System.out.println(getClass().getSimpleName()+"의 update입니다.");

		return false;
	}

	@Override
	public Board selectByBno(int bno) 
	{	
		System.out.println(getClass().getSimpleName()+"의 상세보기입니다.");

		return new QABoard(10,"interface학습","희정","재미있다",false);
	}

}
