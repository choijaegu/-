package ex0724.문제7;


class OracleDao implements DataAccessObject
{
	void OracleDao() {}
	
	public void select() 
	{
		System.out.println("Oracle DB에서 검색");
	}
	public void insert() 
	{
		System.out.println("Oracle DB에서 삽입");
	}
	public void update() 
	{
		System.out.println("Oracle DB에서 수정");
	}
	public void delete() 
	{
		System.out.println("Oracle DB에서 삭제");
	}
	
}

class MySqlDao implements DataAccessObject
{
	void MySqlDao() {}
	
	public void select() 
	{
		System.out.println("MySqlDao DB에서 검색");
	}
	public void insert() 
	{
		System.out.println("MySqlDao DB에서 삽입");
	}
	public void update() 
	{
		System.out.println("MySqlDao DB에서 수정");
	}
	public void delete() 
	{
		System.out.println("MySqlDao DB에서 삭제");
	}
}

public class DaoExample 
{
	public static void dbWork(DataAccessObject dao)
	{
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		
	}
	
	
	
	public static void main(String[] args) 
	{
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}
