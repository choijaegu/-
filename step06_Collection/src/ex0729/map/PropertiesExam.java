package ex0729.map;

import java.io.FileInputStream;   
import java.util.Properties;
import java.util.ResourceBundle;
import java.io.InputStream;

public class PropertiesExam					//자료구조의 목적은 영속성이다.(한번 저장해놓고 여러군데에서 유지하면서 써먹으려구)
{
	Properties pro = new Properties(); //제네릭을 쓰지않음.
									   // 자동으로 String이 들어가있음.
									   // Map의 구조인 Hashtable이 상속받았음.
	public PropertiesExam() 
	{
		//저장
		pro.setProperty("name","희정");			//set으로 넣는다.
		pro.setProperty("age","20");
		pro.setProperty("addr","서울");
		
		//조회
		for (  String key   : pro.stringPropertyNames()   )
		{
			String value = pro.getProperty(key);
			System.out.println(key + " = "+ value);
		}
		
		
	}
	
	/**
	 * 외부에 ~.properties파일 로딩하는 방법
	 * 1) IO를 이용하는 방법.
	 * 2) ResourceBundle 방법.		서로 용도가 좀 다름.		리소스는 정적문서혹은 설정문서, 잘 안변하는 문서.(확장자가 properties를 주로 읽어줌)
	 * 한번만 사용하려면 리소스번들이 편하고 
	 * 재사용성은 IO가 편함.
	 * @param args
	 */
	
	
	//1) IO를 이용하는 방법
	public void test01()
	{
		pro.clear();
		try {
		//1. 파일의 위치의 기준 프로젝트가 기준! - 경로설정할때 src기준으로 잡아줌.
		/*InputStream inputStream =
		new FileInputStream("src/ex0729/map/dbinfo.properties");			//이 작업으로 외부의 key하고 value 가 다 저장된 것.
		pro.load(inputStream);*/
			
		//2. 클래스 위치한 패키지 내에서 파일 로딩할 때 - /생략 (상대경로)	
		/*InputStream inputStream = PropertiesExam.getResourceAsStream("dbInfo.properties");
		pro.load(inputStream);*/
		
			
		//3. 클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
			/*InputStream inputStream = this.getClass().getResourceAsStream("dbInfo.properties");
			pro.load(inputStream);*/
			
			
		//4. ClassLoader의 모든 경로에서 파일 읽음. 보통 resources폴더의 파일읽을 때 사용. 주로 사용하는 방법.
			//InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("a.properties");
			//InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("ex0729/map/dbinfo~);
			InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("ex0726/list/b.properties");
			pro.load(inputStream);									
		}																				//파일위치 기준.
		catch (Exception e) {
			e.printStackTrace();					//콘솔에 오류의 정보를 더 디테일하게 만드는것.
		}
		for (  String key   : pro.stringPropertyNames()   )
		{
			String value = pro.getProperty(key);
			System.out.println(key + " = "+ value);		//map은 순서하고 관련없음.
		}
		
		
	}
	
	
	//2)ResourceBundel 이용하는 방법
	public void test02()
	{	
		System.out.println("********************************");
		/**
		 * ResourceBundle은 ~.properties파일을 로딩하는 전용 클래스로
		 * 파일의 확장자는 생략한다.
		 * 기준 경로가 classes폴더를 기준으로 한다.
		 */
		ResourceBundle rb = ResourceBundle.getBundle("ex0729/map/dbinfo");		//bin이 기준. 배포파일이 올라가있음.	//뒤에 properties는 생략함
		
		for(String key  : rb.keySet()  )
		{
			String value = rb.getString(key);
			System.out.println(key+" | "+ value);
		}
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		new PropertiesExam().test02();
	}

}
