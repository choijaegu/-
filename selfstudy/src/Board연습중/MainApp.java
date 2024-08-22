package Board연습중;

public class MainApp 
{
	
	BoardService service;
	Board board;
	
	public MainApp()
	{
		System.out.println("********1. Free Test*********");
		service = new FreeBoardServiceImpl();
		board = new FreeBoard(4, "Free제목", "삼순", "어렵다");
		
		System.out.println("*********2. QA Test***********");
		service = new QABoardServiceImpl();
		board = new QABoard(4, "QA제목", "삼순","어렵다",true);
		
		System.out.println("*********3. Upload Test*********");
		service = new UploadServiceImpl();
		board = new UploadBoard(4,"Upload", "삼순", "어렵다", "true.jpg");
		
		test(service, board);
	}

	public void test(BoardService service, Board board)
	{
		service.insert(board);
		service.update(board);
		service.selectByBno(1);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("*********게시판 TEST 해보자*********");
		
		new MainApp();
		
		
	}

}
