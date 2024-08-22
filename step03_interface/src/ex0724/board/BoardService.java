package ex0724.board;

/**
 * 모든 게시판유형이 공통으로 사용할 메소드 정의
 * :규격서를 제공한다!
 */



public interface BoardService 	//{ XxxImp}=>인터페이스를 구현한 객체 이름.
{
	/**
	 * 등록하기		
	 * @return:	0이면 실패, 1이상이면 성공					//등록하기는 대부분 성공여부를 리턴함 그래서 boolean이나 int를 많이 씀
	 * @param: Board 객체
	 */
	int insert(Board board);	//FreeBoard or UplaodBoard or QABoard 가 모두 들어와야함 
								//하지만 이 모든걸 상속하는게 Board이기 때문에 Board를 매개변수로 정한다.
								//이를 매개변수다형성이라고 부른다.
	
	
	
	
	/**
	 * 수정하기
	 * :글번호에 해당하는 제목, 내용 수정한다.
	 * : new FreeBoard(글번호, 제목, 내용)
	 *   new QABoard(글번호, 제목, 내용)
	 *   new UploadBoard(글번호, 제목, 내용)
	 * 
	 * @return: boolean형(true이면 수정성공, false이면 수정실패)
	 * @param:	Board 객체 
	 */
	boolean update(Board board);			//
	
	
	
	
	
	/**
	 * 글번호에 해당하는 게시물 조회=검색
	 * @return: 없으면 null, 있으면 Board객체
	 * @param: int
	 */
	Board selectByBno(int bno);
	
	
	//////////////////////////////////////
	/**
	 * java 1.8 version 추가
	 * 	:	interface에 있는 메소드에 static 이나 default 제한자를 추가하면
	 * 		body 선언할 수 있고 공통의 기능을 만들수 있다.
	 * 		또한, 필요한 구현객체만 재정의하면 된다!!
	 * 
	 * 1)static
	 * 	:구현객체 없이 바로 interface이름.메소드이름() 호출가능
	 * 2)default
	 * 	:반드시 구현객체가 있어야 호출할 수 있다.(Impl이 무조건 있어야함)
	 */
	
	
	
	
	/**
	 * 삭제기능
	 */
	default void delete() 
	{
		System.out.println("삭제기능입니다");
	}	//재정의 필요없음.
	
	
	/**
	 * 전체검색
	 */
	
	static void selectAll() 
	{
		System.out.println("전체검색기능입니다");
	}	//
	
	
}
