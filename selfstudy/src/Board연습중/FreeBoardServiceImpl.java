package Board연습중;

public class FreeBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board)
	{	
		System.out.println("Free :"+board);
		System.out.println(getClass().getSimpleName()+"의 insert입니다.");
		
		return 2;
	}

	@Override
	public boolean update(Board board)
	{
		System.out.println("Free :"+board);
		System.out.println(getClass().getSimpleName()+"의 update입니다.");
		
		return false;
	}

	@Override
	public Board selectByBno(int bno)
	{	
		System.out.println(getClass().getSimpleName()+"의 selectByBno입니다");
		
		
		return new FreeBoard(20,"수업중","나영","좋아요");
	}

}
