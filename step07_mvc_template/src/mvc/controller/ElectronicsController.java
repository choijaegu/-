package mvc.controller;

import java.util.List; 

import mvc.dto.Electronics;
import mvc.exception.DuplicateModelNoExeption;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;
import mvc.service.ElectronicsService;
import mvc.service.ElectronicsServiceImpl;
import mvc.view.FailView;
import mvc.view.SuccessView;



/**
 * View와 Model 사이에서 중간 역할 
 *  : 사용자의 요청을 받아서 그에 해당하는 서비스를 호출하고
 *    호출한 결과를 받아서 결과값에 따라 결과 뷰를 호출해준다.
 */

public class ElectronicsController {
    private ElectronicsService service = ElectronicsServiceImpl.getInstance();
    

    /**
     * 전체검색
     */
    public void selectAll() 
    {	
    	List<Electronics> list = service.selectAll();
    	SuccessView.printAll(list);
    	
    }
 

	 /**
     * 전자제품 등록 
     */
   
    public void insert(Electronics electronics) 
    { 	try 	
    	{
    	service.insert(electronics);
    	SuccessView.printMessage("수정이 완료되었습니다.");
    	}
    	catch(ElectronicsArrayBoundsException e) 
    	{
    		FailView.errorMessage("생성범위를 초과하여 더 이상 생성할 수 없습니다."); 
    	}
    	catch(DuplicateModelNoExeption d)
    	{
    		FailView.errorMessage("등록한 값이 올바르지 않습니다.");
    	}
    	
    	List<Electronics> list = service.selectAll();
    	SuccessView.printAll(list);
    }
    
    

    /**
     * 모델번호에 해당하는 전자제품 검색
     * @param modelNo
     */
    public void searchByModelNo(int modelNo) 
    {	
    		
    	try 
    	{
    	Electronics elec =service.searchByModelNo(modelNo);
    	SuccessView.printSearchByModelNo(elec);
    	}
    	catch(SearchNotFoundException s)
    	{
    		FailView.errorMessage("해당 넘버는 존재하지 않습니다.");
    	}
    	
    } 

    /**
     * 모델번호에 해당하는 전자제품 수정하기 
     * @param electronics
     */
    public void update(Electronics electronics) 
    {
    	try
    	{
    	service.update(electronics);
    	SuccessView.printMessage("수정이 완료되었습니다.");
    	}
    	catch(SearchNotFoundException s)
    	{
    		FailView.errorMessage("해당 넘버는 존재하지 않습니다.");
    	}
    	
    	List<Electronics> list = service.selectAll();
    	SuccessView.printAll(list);
    }
    
    /**
     * 모델번호에 해당하는 전자제품 삭제하기 
     * @param electronics
     */
	public void deleteModelNo(int modelNo) 
	{	try
		{
		service.delete(modelNo);
		SuccessView.printMessage("삭제가 완료되었습니다.");
		}
		catch(SearchNotFoundException s)
		{
			FailView.errorMessage("해당 넘버는 존재하지 않습니다.");
		}
		List<Electronics> list = service.selectAll();
		SuccessView.printAll(list);
	}
	
	/**
     *  가격을 기준으로 정렬하기
     *  만약, 가격이 같으면 modelNo를 기준으로 정렬한다.
     * @return
     */
    public void selectSortByPrice() 
    {
    	List<Electronics> list = service.selectSortByPrice();
    	SuccessView.printMessage("정렬이 완료되었습니다.");
		SuccessView.printAll(list);
    }
    
}











