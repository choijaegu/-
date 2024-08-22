package studentconstructor;

/**
 * 학생의 정보를 관리 하는 서비스(등록, 수정, 검색,....)
 * */
public class StudentService {
	//private Student [] stArr;//null
	private Student [] stArr = new Student [10];//stArr에는 주소값, stArr[0]에는 null
	
	public static int count;// 배열에 저장된 객체의 개수를 체크하는 변수 
	
	/**
	 * 초기치데이터 3명 정도 세팅하기 
	 * */
	 public  StudentService() { //생성자 -> new StudentService()일때 자동호출
		 //3명의 학생을 배열에 저장한다.
		 System.out.println("++하기 전"+count);
		 stArr[StudentService.count++] = this.create("희정", 20, "서울");
		 System.out.println("++한 후"+count);
		 stArr[count++] = this.create("나영", 24, "대구");
		 stArr[count++] = this.create("민희", 22, "대전");
		
	 }
	
	/**
	 *  Student객체를 생성해서 리턴해주는 메소드 작성
	 * */
	 private Student create(String name, int age, String addr) {
		 Student st1 = new Student(name, age, addr);
		 return st1;
	 }
	
	 /**
	  * 전체 학생의 정보 조회하기
	 * */
	 public Student []  selectAll(){
		 //기능 
		 System.out.println("stArr = "+ stArr);
		 //리턴
		 return stArr;//주소값
		 
	 }
	 
	 

	 /**
	   학생의 정보 등록하기 
	    : 배열의 길이를 벗어났는지 체크 = -1
	    : 이름이 중복인지 체크 = 0
	    : 유효성체크가 완료되면 등록한다  . = 1
	      
	      
	      @return : -1이면 길이제한, 0이면 이름중복, 1이면 성공
	      
	  **/
	 public int insert(Student student){
		 // 정보를 더 저장할수 있는 체크
		 if(count == stArr.length)
			 return -1;
		 
		 //이름이 중복인지 체크
		 Student searchedStudent = this.selectByName(student.getName());
		 if(searchedStudent != null)
			 return 0;
		 
		 //아니면 저장한다.
		 stArr[count++] = student;
		 
		return 1;
	 }
	 
	
	/**
	 * 이름에 해당하는 학생의 정보 검색하기
	 * : 이름은 중복안됨!
	 * : 찾으면 객체를 리턴하고 못찾으면 null 리턴 
	 * 
	 * */
	 public Student selectByName(String name)
	 {
		 for(int i=0; i< this.count ; i++)
		 {
			 Student st = stArr[i];
			 if(st.getName().equals(name)) 
			 {
				 //찾았다
				 return st;
			 }
		 }
		 
		 return null;
	 }
	
	
	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기 
	 *  : 이름에 해당하는 정보가 없으면 0리턴
	 *  : 정보가 있으면 수정하고 1을 리턴한다.
	 *   
	 * */
	 public int update(Student student) {
		 //전달된 정보에서 이름을 꺼내어 배열에 있는 학생인지 체크하고
		 //있으면 수정 ,없으면 0을 리턴한다.
		Student searchedSt = this.selectByName( student.getName() );
		if(searchedSt == null)
			return 0;
		
		
		//수정하자.
		searchedSt.setAge( student.getAge() );
		searchedSt.setAddr( student.getAddr() );
		
		return 1;
	 }

}



