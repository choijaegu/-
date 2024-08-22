package ex0724.board;

public class FreeBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("Free :" + board);
		System.out.println(getClass().getSimpleName()+"의 insert 입니다.");
		//앞에 super. 안써도 당연히 부모에 있는거 가져옴.
		return 2;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("Free :" + board);
		System.out.println(super.getClass().getSimpleName()+"의 update 입니다.");
		return false;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println(super.getClass().getSimpleName()+"의 selectByBno 입니다.");
		return new FreeBoard(20,"수업중","나영","좋아요");
	}

}
