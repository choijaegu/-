package ex0724.board;

/*
 * 자유게시판 정보(속성) 관리 객체
 */



public class FreeBoard extends Board 
{		
		public void FreeBoard() {}

		public FreeBoard(int bno, String subject, String writer, String content) 
		{
			super(bno, subject, writer, content);
			
		}
		
		public FreeBoard(int bno, String subject, String content)
		{
			super(bno, subject, content);
		}

		public String toString() 
		{
			StringBuilder builder = new StringBuilder();
			builder.append(super.toString());
			builder.append("]");
			
			return builder.toString();
		}
			
}
