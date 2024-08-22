package ex0717.array;

class MultiArray
{
//정수형 2차원 배열 8*9
int arr [][]=new int[8][9];
//메소드이름 :array99
	
	//for loop 를 사용하여 
	//배열에 곱한 (구구단)결과저장
	//배열에 결과를 꺼내출력
	public void array99()
	{	
		int rowLen = arr.length;
		for(int i=0; i <rowLen ; i++)//배열은 무조건 0부터 시작하므로 0부터 시작하는게 좋다.
		{	int colsLen = arr[i].length;
			for(int j = 0; j <colsLen ; j++)
			{
				int to = (i+2)*(j+1);
				arr[i][j] = to;
				System.out.print((i+2)+"*"+(j+1)+"= "+to+" ");
				
			}System.out.println();
		}
	}
}	
		
		
public class MemoryApart
{


	public static void main (String[]args)
		{ 	
			MultiArray mu = new MultiArray();
			mu.array99();
		}
	
//main메소드에서 
//MultiArray객체의 array99메소드호출
	
}
