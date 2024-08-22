package ex0801;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIThreadExam extends JFrame
{	
	JTextField text1 = new JTextField(5);
	JTextField text2 = new JTextField(5);
	JButton bth = new JButton("눌러봐");
	
	public GUIThreadExam()
	{	
		super("재미있다");
		
		//6)JFrame의 레이아웃 변경
		super.setLayout(new FlowLayout());
		
		//5)각 컴포넌트를 컨테이너 위에 추가
		Container con = super.getContentPane();
		con.add(text1);
		con.add(text2);
		con.add(bth);
		//2)창크기도 정해줘 정중앙을 놓으려면 얘를 먼저 써줘야함.
		super.setSize(500,400);
		
		//3)정중앙에 놓아주세요.
		super.setLocationRelativeTo(null);
		
		
		//1)프레임을 보여줘.
		super.setVisible(true);
		
		
		//4)x를 클릭하면 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//시계동작.
		new ClockThread().start();
		
		//1~1000까지 text위에 올린다.
		new Thread(()->
		{	for(int i =1; i<=1000; i++)
			{
			//기능
			text1.setText(i+" ");
			try {
			Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			}
		}).start();
		
		
		//버튼을 클릭했을 때 기능
		bth.addActionListener((e)->{
			//알파벳을 text2에 올린다.
			new Thread(()->{
				for(char ch = 'A';ch <='z'; ch++)
				{
					text2.setText(ch+"");
					try
					{
						Thread.sleep(200);
					}
					catch(InterruptedException ex)
					{
						ex.printStackTrace();
					}
				}
			}).start();
		});
		
	}//생성자 끝
	
	public static void main(String[] args) 
	{
		new GUIThreadExam();
		
	
		
	}
	
	/**
	 * JFrame위에 시계 동작 Thread
	 */
		
	class ClockThread extends Thread			//인어클래스
	{	
		@Override
		public void run()
		{	
			while(true)
			{
				Calendar now = Calendar.getInstance();
				int y = now.get(Calendar.YEAR);
				int m = now.get(Calendar.MONTH)+1;
				int d = now.get(Calendar.DATE);
				
				int h = now.get(Calendar.HOUR_OF_DAY);
				int min = now.get(Calendar.MINUTE);
				int s = now.get(Calendar.SECOND);
				
				String time = y+"년"+m+"월"+d+"일"+h+":"+min+":"+s;
				
				
			//setTitle("시계");					//.을 찍지 않으면 지혼자 찾으러감. 혹시 clockThread에 있나? Thread에 있나? GUIThreadExam에 있나? JFrame에 있네 하며 찾아감.
			GUIThreadExam.this.setTitle(time);	//만약 아우터쪽에 이름과 중복되면 이렇게 적어야함.	
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			}//while end	
			
		}//run end
		
	}//Inner클래스 end
}
/////////////////////////////////////////////////////////

