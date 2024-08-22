package ex0725.ex06;
/**
 * 신청자(사람, 직장인, 학생, 고등, 중학)가 과정을 신청하는 클래스
 * */
public class Course {
    /**
     * 모든 사람 허용(등록)
     * */
	public void register1(Applicant<?> applicant) {					//<?> 뜻은 모든걸 허용하겠다는  뜻.
		System.out.println(applicant.getKind().getClass().getSimpleName() +"가 신청하였습니다. register1");
	}
	
	/**
	 * 직장인만 허용(등록)
	 * */
    public void register2(Applicant<? super Worker> applicant) {	//Worker를 고려해서 2개 파라미터
     	System.out.println(applicant.getKind().getClass().getSimpleName() +"가 신청하였습니다. register2");
	}
	
	/**
	 * 학생만 허용 (등록)
	 * */
    public void register3(Applicant<? extends Student> applicant) {		//Student를 고려해서 
    	System.out.println(applicant.getKind().getClass().getSimpleName() +"가 신청하였습니다. register3");
	}
}


