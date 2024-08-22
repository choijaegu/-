package Board연습중;

public class UploadServiceImpl implements BoardService {

	@Override
	public int insert(Board board) 
	{
		System.out.println("Upload :"+board );
		System.out.println(getClass().getSimpleName()+"님의 insert입니다.");
		
		return 3;
	}

	@Override
	public boolean update(Board board) 
	{
		System.out.println("Upload :"+board);
		System.out.println(getClass().getSimpleName()+"님의 update입니다.");
		
		return false;
	}

	@Override
	public Board selectByBno(int bno) 
	{
		System.out.println(getClass().getSimpleName()+"님의 selectByBno입니다.");
		
		return new UploadBoard(20,"수업중","나영","좋아요","a.jpg");
	}

}
