package ex0724.board;

public class UploadServiceImpl implements BoardService {

	@Override
	public int insert(Board board) 
	{	System.out.println("Upload: "+board);
		System.out.println(getClass().getSimpleName()+"의 insert입니다.");
		
		return 3;
	}

	@Override
	public boolean update(Board board) 
	{
		System.out.println("Upload: "+board);
		System.out.println(getClass().getSimpleName()+"의 update입니다.");
		return false;
	}

	@Override
	public Board selectByBno(int bno) 
	{	
		System.out.println(getClass().getSimpleName()+"의 상세보기입니다");
		return new UploadBoard(30, "자료첨부", "미미","다운로드하세요", "a.jpg");
		

	}

}
