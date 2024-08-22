package mvc.service;

import java.util.ArrayList;  
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import mvc.dto.Electronics;
import mvc.exception.DuplicateModelNoExeption;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=10;
    List<Electronics> list = new ArrayList<Electronics>();
    
    
    /** 
     * 외부에서 객체 생성안됨. 
     * InitInfo.properties파일을 로딩하여  List에 추가하여
     * 초기치 데이터를 만든다.
     *
     */
    
   
    private ElectronicsServiceImpl() 				//Properties는 맵에서 계속 꺼내먹으려고 하는거고 어짜피 지금은 생성자는 번들만 해도됨. 
    {
    	/**
		 * ResourceBundle은 ~.properties파일을 로딩하는 전용 클래스로
		 * 파일의 확장자는 생략한다.
		 * 기준 경로가 classes폴더를 기준으로 한다.
		 */
		ResourceBundle rb = ResourceBundle.getBundle("InitInfo");		//bin이 기준. 배포파일이 올라가있음.	//뒤에 properties는 생략함
		
		for(String key  : rb.keySet()  )
		{
			String value = rb.getString(key);
			
			//System.out.println(key+" | "+ value);
			//value의 값을 콤마를 기준으로 분리한다.
			String v []= value.split(",");
			Electronics elec = new Electronics(Integer.parseInt(v[0]),v[1],Integer.parseInt(v[2]), v[3]);
			list.add(elec);
			
		}  		
    		
    	
    	
    }
    public static ElectronicsService getInstance() {	//싱글톤
		return instance;
	}
    
	@Override
	public void insert(Electronics electronics) throws ElectronicsArrayBoundsException,DuplicateModelNoExeption 
	{	try
		{
			Electronics elec =this.searchByModelNo(electronics.getModelNo());
			
			if(elec != null)
			{
				throw new DuplicateModelNoExeption();
			}
		}
			
		catch(SearchNotFoundException s)
		{
			
		
		if(list.size()<=MAX_SIZE)
		{
			list.add(new Electronics(electronics.getModelNo(),electronics.getModelName(),electronics.getModelPrice(),electronics.getModelDetail()));
		}
			else throw new ElectronicsArrayBoundsException();
			
		
		}
	
		
	}

	@Override
	public List<Electronics> selectAll() {
		
		
		return list;
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException
	{
		
		for(Electronics elec: list )
		{
			if(elec.getModelNo() == modelNo)
			{	
				
				return elec;
				
			}
			
			
		}throw new SearchNotFoundException();
		
	}

	@Override
	public void update(Electronics electronics) throws SearchNotFoundException 
	{	
		
		Electronics elec = this.searchByModelNo(electronics.getModelNo());
		if(elec != null)
		{
			elec.setModelDetail(electronics.getModelDetail ());
		 } 
		
	}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException 
	{	
		Electronics elec = this.searchByModelNo(modelNo);
		int count = 0;										//list.remove(elec)도 가능.
		int a=0;
		if(elec != null)
		{
			for(Electronics e : list)
			{	
				if(e.getModelNo() == modelNo)
				{	
					a=count;
					
				}
				count++;
			}
			list.remove(a);
		}
	}

	@Override
	public List<Electronics> selectSortByPrice() 
	{
		List<Electronics> sortedList = new ArrayList<Electronics>(list);
		Collections.sort(sortedList , 
				  (o1, o2)-> o1.getModelPrice() - o2.getModelPrice()  );
		return sortedList;
	}
    
} // 클래스 끝 