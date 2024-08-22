package array.exam;

import ex0718.array.StudentService;

/**
  요청 결과를 출력할 view
*/
public class EndView{
   /**
     성공여부 메시지를 출력하는 메소드 
   */
   public static void printMessage(String message){
      System.out.println(message+"\n");
   }

   /**
     전체검색 결과를 출력하는 메소드
   */
   public static void printSelectAll(Goods [] arr)
   {//service에 있는 주소가 전달되었다.
	   
	   for(int i= 0; i < GoodsService .count ; i++) 
		{	
			System.out.print("코드: "+ arr[i].getCode()+"\t");
			System.out.print("나이: "+ arr[i].getName()+"\t");
			System.out.print("가격: "+ arr[i].getPrice()+"\t");
			System.out.print("설명: "+ arr[i].getExplain()+"\n");
			
		}

   }

   /**
     상품코드에 해당하는 상세정보 출력하는 메소드 
   */
   public static void printSelectByCode(Goods goods){
  
   }


}