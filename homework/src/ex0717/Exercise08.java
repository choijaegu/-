package ex0717;

public class Exercise08 
{

	public static void main(String[] args) 
	{
		int[][] array = 				//array[][]면 2차배열 array[]면 1차배열 array만 그냥 있으면 변수라고 생각하면 됨.
		{
				{95,86}, //0행.				//명시적 초기화라고 함.
				{83,92,96},	//1행.
				{78,83,93,87,88}	//2행.	//0행~2행까지 열의 길이가 달라지므로 이를 가변적 행렬이라고한다.
		};
		
		int sum = 0;					
		double avg = 0.0;
		int count = 0;	// =>j반복문에 count++ 를 써서 개수를 셀 수 있다.
		int rowArr = array.length;	//변수선언안하고 그냥 length로 쓰면 불필요한 반복이 된다.
		
		for(int i=0; i<rowArr; i++)
		{	int colArr = array[i].length;
		
			for(int j=0; j<colArr; j++)
			{
				sum += array[i][j];
				count++;
			}
		}
		avg = ((double)sum/count);
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}

}
