package ex0724.board;

public class MainApp
{
	
	BoardService service;
	Board board;
	
	public MainApp()
	{	System.out.println("******1. Free Test*********");
		service = new FreeBoardServiceImpl();
		board= new FreeBoard(4, "free제목", "삼순","어렵다");	//toString은 모든 객체뒤에 toString이 생략되어있다.
			
		System.out.println("******2. QA Test*********");
		service = new QABoardServiceImpl();
		board = new QABoard(4, "QA제목", "삼순","어렵다", true);
		
		System.out.println("******3. Upload Test Test*********");
		service = new UploadServiceImpl();
		board = new UploadBoard(4, "upload", "삼순","어렵다", "true.jpg");
			
		test(service, board);
	}
	/*	
	 * 각 service의 insert, update, selectXxx을 호출해보자
	 */
	
	public void test(BoardService service , Board board)	//Impl3개가 다 들어올수 있다.
	{				//상위 타입을 정해놓으면 하위가 호출된다.
		service.insert(board);
		service.update(board);
		service.selectByBno(1);
		service.delete();	//인터페이스에 재정의안하고 default를 쓴 경우
		
		BoardService.selectAll();	//인터페이스에 재정의 안하고 static을 쓴 경우
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	public static void main(String[] args) 
	{
		System.out.println("******게시판 TEST 해보자*********");
		
		new MainApp();
		
		
	}

}
