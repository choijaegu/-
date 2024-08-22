package selfstudy;

public class 중첩for문실험용 {

	public static void main(String[] args) {
		//1~100까지 10행 10열로 
		int sum = 1;
		for(int i = 1; i<=10 ; i++ )
		{
			for(int j = 1; j<=10 ; j++)
				System.out.print(sum++ + "\t");
				System.out.println();
	    }
				
}
}