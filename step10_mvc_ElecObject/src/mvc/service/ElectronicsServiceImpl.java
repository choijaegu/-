package mvc.service;

import java.util.ArrayList;  
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import mvc.dto.Electronics;
import mvc.exception.DuplicateModelNoException;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;
import mvc.view.SuccessView;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=6;
    List<Electronics> list = new ArrayList<Electronics>();
    
    /** 
     * 외부에서 객체 생성안됨. 
     * InitInfo.properties파일을 로딩하여  List에 추가하여
     * 초기치 데이터를 만든다.
     * 
     */
    private ElectronicsServiceImpl() {
    	ResourceBundle rb = ResourceBundle.getBundle("InitInfo");
    	for(String key : rb.keySet()) {
    		String values[] = rb.getString(key).split(",");
    		list.add(new Electronics(Integer.parseInt(values[0]), values[1], Integer.parseInt(values[2]), values[3]));
    	}
    }
    
    public static ElectronicsService getInstance() {
		return instance;
	}

	@Override
	public void insert(Electronics electronics) throws ElectronicsArrayBoundsException, DuplicateModelNoException {
		if(list.size()>=MAX_SIZE) {
			throw new ElectronicsArrayBoundsException("더이상 저장 불가");
		}
		try {
			this.searchByModelNo(electronics.getModelNo());
			throw new DuplicateModelNoException(electronics.getModelNo()+"는 이미 있는 모델 번호입니다");
		} catch (SearchNotFoundException e) {
			list.add(electronics);
		}
	}

	@Override
	public List<Electronics> selectAll() {
		return list;
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
    	for(Electronics e : list) {
    		if(e.getModelNo() == modelNo) {
    			return e;
    		}
    	}
    	throw new SearchNotFoundException("모델번호가 존재하지 않습니다.");
	}

	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		Electronics e = this.searchByModelNo(electronics.getModelNo());
		e.setModelDetail(electronics.getModelDetail());
	}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		Electronics e = this.searchByModelNo(modelNo);
		list.remove(e);
		//SuccessView.printAll(list); //근데 어차피 View는 Controller에서 담당해야 함.
	}

	@Override
	public List<Electronics> selectSortByPrice() {
		List<Electronics> list2 = new ArrayList<Electronics>(list);
		Collections.sort(list2, (elec1, elec2)->(elec1.getModelPrice()-elec2.getModelPrice()==0) ? (elec2.getModelNo()-elec1.getModelNo()) : (elec1.getModelPrice()-elec2.getModelPrice())); 
		return list2;
	}
    
} // 클래스 끝 