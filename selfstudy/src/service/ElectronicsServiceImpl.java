package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import mvc.exception.DuplicateModelNoExeption;
import mvc.exception.ElectronicsArrayBoundsException;

public class ElectronicsServiceImpl implements ElectronicsService
{
	private static Electronicservice instance = new ElectronicsServiceImpl();
	private static final int MAX_SIZE = 10;
	List<Electronics> list = new ArrayList<Electronics>();
	
	/**
	 * 외부에서 객체 생성 안됨.
	 * InitInfo.properties파일을 로딩하여 List에 추가하여
	 * 초기치 데이터를 만든다.
	 */
	
	private ElectronicsServiceImpl()
	{
		ResourceBundel rb = ResourceBundle.getBundle("InitInfo");
		
		for(String key : rb.keySet())
		{
			String value = rb.getString(key);
			
			//System.out.println(key+" | "+value);
			//value의 값을 콤마를 기준으로 분리한다.
			String v [] = value.split(";");
			Electronics elec = new Electronics(Integer.parseInt(v[0]), v[1], Integer.parseInt(v[2]), v[3]);
			list.add(elec);
			
			
		}
		
		
		
	}
	public static ElectronicsService getInstance()
	{
		return instance;
	}
	
	
	@Override
	public List<Electronics> selectAll()		
		
	{
		return list;
		
	}
	
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException
	{
		
		
		for(Electronics elec : list)
		{
			
			if(elec.getModelNo() == modelNo) 
			{
			
				return elec;
				
				
			}
			
			
			
			
			
			
		}throw new SearchNotFoundException();
		
		
	}
	public void insert(Electronics electronics) throws ElectronicsArrayBoundsException,DuplicateModelNoExeption 
	{
		try
		{
			Electronics elec = this.searchByModelNo(electronics,getModelNo());
			
			if(elec != null)
			{
				throw new DuplicateModelNoExeption();
			}
			
			
		}
		catch(searchNotFoundException s)
		{
		
			if(list.size()<=MAX_SIZE)
			{
				list.add(new Electronics(electronics. getModelNo(),electronics. getModelName(),electronics.getModelPrice(),electronics.getModelDetail() ))
				
			}
			else throw new ElectronicsArrayBoundsException();
		
		
		
		
		}
		
		
		
	}
	
	
	public void update(Electronics electronics) throws SearchNotFoundException
	{
		Electronics elec = this.searchByModelNo(electronics.getModelNo());
		if(elec != nul)
		{
			elec.setModelDetail(electronics.getModelDetail());
		}
		
		
		
		
		
	}
	
	
	public void delete(int modelNo) throws SearchNotFoundException
	{
		Electronics elec = this.searchByModelNo(modelNo);
		int count = 0;
		int a = 0;
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
			list.remove(a); //remove는 for문 밖에서 쓰는걸 권장함.
			
			
		}
		
		
		public List<Electronics> selectSortByPrice()
		{
			
			List<Electronics> sortedList = new ArrayList<Electronics>(list);
			Collections.sort(sortedList, (o1,o2)->o1.getModelPirce()-o2.getModelPrice());	
			return sortedList;
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
