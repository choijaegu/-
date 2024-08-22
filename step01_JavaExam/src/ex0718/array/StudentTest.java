package ex0718.array;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("***학생 관리 프로그램 시작합니다.******");
		StudentService service = new StudentService();//StudentService의 전역변수들이 초기화 
		service.init(); // 초기치데이터 세팅
		
		/*전체학생정보 출력*/
		
		Student studentArr[]  = service.selectAll();
		System.out.println("studentArr = : " + studentArr);
		StudentEndView.printSelect(studentArr);
		
		//이름으로 검색하기
		System.out.println("--3. 이름으로 검색 -----");
		Student student =service.selectByName("희정");
			if(student == null)
				{
				StudentEndView.printMessage("찾는 정보가 없습니다.");
				}
			else
				{
				StudentEndView.printSearchName(student);
				}
		
		//System.out.println("--이름이 없는경우----");
		//service.selectByName("삼순이");
		
		
		
	
		//등록하기
		System.out.println("--1. 등록하기 -----");
		 student = new Student();
		 student.setName("원빈");
		 student.setAge(90);
		 student.setAddr("용인");
		
		
		int result = service.insert(student);
		if(result == -1)
		{
			StudentEndView.printMessage("더 이상 추가 할 수 없습니다.");
		}
		if(result == 0)
		{
			StudentEndView.printMessage("이름이 중복되어 추가할 수 없습니다.");
		}
			else 
			{
				StudentEndView.printMessage("등록되었습니다.");
			}
			
		System.out.println("--등록완료 후 전체검색 -----");
		Student [] arr = service.selectAll();
		StudentEndView.printSelect(studentArr);
		
		//System.out.println("--2. 전체검색 -----");
		//service.selectAll();
		
		
		
		//수정하기 
		System.out.println("--4. 수정하기 -----");
		Student st2 =new Student();
		st2.setName("나영");//조건
		st2.setAge(23);
		st2.setAddr("대전");
		
		result = service.update(st2);
		if(result==0)
			StudentEndView.printMessage("이름이 잘못되어 수정할 수 없어요.");
		else
			StudentEndView.printMessage("정보를 수정했습니다.");
		
		System.out.println("---변경후 ---");
		arr = service.selectAll();
		StudentEndView.printSelect(arr);

	}

}








