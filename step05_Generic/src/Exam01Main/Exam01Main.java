package Exam01Main;

public class Exam01Main 
{	
		public static void main(String[] args) 
		{
			Box<String> box01 = new Box<String>();				//String타입에 <>이렇게 비어있는 곳에 넣어도 됨.
			box01.content="새우깡";
			
			Box<Integer> box02 = new Box<Integer>();
			box02.content = 100;		//=>    int -Integer>
			box02.setContent(10); 		// integer}int
			
			int count = 100;
			
			Box<Board> box03 = new Box<Board>();
			box03.content = new Board();
			
			Box box4 = new box();
			
			
		}
		
		
}
