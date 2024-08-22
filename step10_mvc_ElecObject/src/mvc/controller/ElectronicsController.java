package mvc.controller;

import java.util.List; 

import mvc.dto.Electronics;
import mvc.exception.DuplicateModelNoException;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;
import mvc.service.ElectronicsService;
import mvc.service.ElectronicsServiceImpl;
import mvc.view.FailView;
import mvc.view.SuccessView;

/**
 * View와 Model 사이에서 중간 역할 : 사용자의 요청을 받아서 그에 해당하는 서비스를 호출하고 호출한 결과를 받아서 결과값에 따라
 * 결과 뷰를 호출해준다.
 */

public class ElectronicsController {
	private ElectronicsService service = ElectronicsServiceImpl.getInstance();

	/**
	 * 전체검색
	 */
	public void selectAll() {
		List<Electronics> list = service.selectAll();
		SuccessView.printAll(list);
	}

	/**
	 * 전자제품 등록 
	 * 컨트롤러역할이 너무 많다->serviceImpl로 옮겨보기
	 */

	/*
	 * public void insert(Electronics electronics) { try { electronics =
	 * service.searchByModelNo(electronics.getModelNo()); if(electronics!=null) {
	 * throw new DuplicateModelNoException("이미 존재하는 모델 번호"); } }catch
	 * (SearchNotFoundException e) { try { service.insert(electronics); }catch
	 * (ElectronicsArrayBoundsException e2) { System.out.println(e2.getMessage());
	 * }catch (DuplicateModelNoException e3) { System.out.println(e3.getMessage());
	 * } }catch (DuplicateModelNoException e) { System.out.println(e.getMessage());
	 * } }
	 */

	public void insert(Electronics electronics) {
		 try {
			service.insert(electronics);
			SuccessView.printMessage("삽입 성공");
		} catch (ElectronicsArrayBoundsException | DuplicateModelNoException e) {
			 FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 모델번호에 해당하는 전자제품 검색
	 * 
	 * @param modelNo
	 */
	public void searchByModelNo(int modelNo) {
		try {
			Electronics e = service.searchByModelNo(modelNo);
			SuccessView.printSearchByModelNo(e);
			SuccessView.printMessage("검색성공");
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 모델번호에 해당하는 전자제품 수정하기
	 * 
	 * @param electronics
	 */
	public void update(Electronics electronics) {

		try {
			service.update(electronics);
			SuccessView.printMessage("수정 성공");
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 모델번호에 해당하는 전자제품 삭제하기
	 * 
	 * @param electronics
	 */
	public void deleteModelNo(int modelNo) {
		try {
			service.delete(modelNo);
			
			SuccessView.printMessage("삭제 성공");
			
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 가격을 기준으로 정렬하기 만약, 가격이 같으면 modelNo를 기준으로 정렬한다.
	 * 
	 * @return
	 */
	public void selectSortByPrice() {
		List<Electronics> list2 = service.selectSortByPrice();
		SuccessView.printAll(list2);
	}

}
