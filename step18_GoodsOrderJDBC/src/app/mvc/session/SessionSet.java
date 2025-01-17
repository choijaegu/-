package app.mvc.session;

import java.util.HashSet;
import java.util.Set;

public class SessionSet {//싱글톤

	private static SessionSet ss = new SessionSet(); //static 싱글톤이라 광범위하게 사용가능.
	private Set<Session> set; //중복안되고 순서없다!
	
	private SessionSet() {
		set = new HashSet<>();
	}
	
	public static SessionSet getInstance() {//SessionSet.getInstance() 호출해서 SessionSet 리턴받는다.
		return ss;
	}
	
	
	/**
	 * 사용자 찾기
	 * */
	public Session get(String sessionId) {
		for(Session session : set) {
			if(session.getSessionId().equals(sessionId)) {
				return session;
			}
		}
		return null;
	}
	
	//세션 객체들 반환
		public Set<Session> getSet(){
			return set;
		}
	
		/**
		 * 로그인 된 사용자 추가
		 * */
		public void add(Session session) {
			set.add(session);
		}
		
	/**
	 * 사용자 제거 - 로그아웃
	 * */
	public void remove(Session session) {
		set.remove(session);
	}
	
	
}
