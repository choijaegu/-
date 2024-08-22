package ex0718.array;

/**
 * 학생의 정보를 관리 하는 서비스(등록, 수정, 검색,....)(삭제는 사실 해당 인덱스를 null로 바꿔주는것이다.
 * 														왜냐하면 배열의 길이는 조정할 수 없기 때문.) 
 * */
public class StudentService 
{
	//private Student stArr[];	//stArr 에는 null이 들어가있는 상태.
	private Student stArr[] = new Student[10]; /* 순서 1)
												Student.java 안에있는 Student클래스의 객체타입을 생성한다.
												stArr에는 주소값, stArr[0]에는 null이 들어가있는상태.*/
	
	static int count; /*멤버필드 count는 0부터 시작.			배열방에는 몇개의 개수가 있는지 실제로 알 수가 없다.
												 		         * 그래서 카운트 변수를 이용한다.
												 		         */
	
	/**
	 * 초기치데이터 3명 정도 세팅하기 
	 * */
	public void init()//순서 3)
	{	
		
	
		//3명의 학생을 배열에 저장한다.
		/*Student st1 = new Student();
		st1.setName("희정");//해당클래스에 전역변수에는 프라이빗이 걸려있기 때문에 set메소드를 해서 수정해야함.
		st1.setAge(20);
		st1.setAddr("서울");*/
		stArr[StudentService.count++] = this.create("희정", 20, "서울");
		stArr[count++] = this.create("나영", 24, "용인");
		stArr[count++] = this.create("민희", 22, "대전");
		
		
		/*stArr[0]= st1; stArr이라는 배열의 0번쨰 방에 st1이 들어가는 과정이다.
						st1은 지역변수라 해당 메소드가 끝나면 사라지지만 stArr[]은 전역변수로 메소드가 끝나도 살아남는다.*/
		
						
	}
	
	/**
	 *  Student객체를 생성해서 리턴해주는 메소드 작성
	 * */
	 private Student create(String name, int age, String addr)	/* 순서2)
	 																Student라는 데이터타입을 리턴하는것.*/
	 {
		 Student st1 = new Student();
		 st1.setName(name);
		 st1.setAge(age);
		 st1.setAddr(addr);
		 return st1;
	 }
	
	 /**
	 * 전체 학생의 정보 조회하기
	 * */
	 public Student [] selectAll() 
	 {	
		 //기능
		 System.out.println("stArr"+ stArr);
	 //리턴
		 return stArr;
	 }
	 
	 
	 
	 /**
	   학생의 정보 등록하기 
	    : 배열의 길이를 벗어났는지 체크 =>-1
	    : 이름이 중복인지 체크 =>0
	    : 유효성체크가 완료되면 등록한다. =>1
	    
	    	@return: -1이면 길이제한, 0이면 이름중복, 1이면 성공
	  **/
	 public int insert (Student student)
	{
		 //정보를 더 저장할 수 있는지 체크
		 if(count == stArr.length)
			 return -1;
		 
		 //이름이 중복인지 체크
		 Student searchedStudent = this.selectByName(student.getName());
		 if(searchedStudent != null)
			 return 0;
		 
		 //아니면 저장한다.
		 stArr[count++]=student;
		 
		 return 1;
	 }
	 
	
	/**
	 * 이름에 해당하는 학생의 정보 검색하기
	 *  : 이름은 중복안됨!
	 *  : 찾으면 객체를 리턴하고 못 찾으면 null 리턴
	 * */
	 public Student selectByName(String name) //배열이 아닌 1명의 Student를 리턴해야함.
	 {					//String을 비교할때는 equals로 찾아야함.
		 for(int i=0; i < count; i++)
		 {
			 Student st = stArr[i];
			 if(st.getName().equals(name))
			 {
				 return st;
			 }
		 }
		 return null; //else가 필요없다.
	 }
	
	
	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기 
	 *  : 이름에 해당하는 정보가 없으면 0리턴
	 *  : 정보가 있으면 수정하고 1을 리턴한다.
	 * */
	 public int update (Student student) 
	 {	//전달된 정보에서 이름을 꺼내어 배열에 있는 학생인지 체크하고
		 //있으면 수정 , 없으면 0을 리턴한다.
		 Student searchedSt = this.selectByName(student.getName());
		 if(searchedSt == null)
		 {
			 return 0;
		 }
		 //수정하기.
		 searchedSt.setAge(student.getAge());
		 searchedSt.setAddr(student.getAddr()); //들어온 인수와 찾은 변수를 잘 구분해야함
		 						 //즉 변경해야 될 애는 searchedSt.
		 return 1;
		 
	 }

}

