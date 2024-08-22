/* 최재구.
 * 7월10일.
 * 성적표 If문,Switch문 만들기. 
 */


package ex0710숙제;


public class 성적표 {


	public static void main(String[] args) {
	String na = "최재구";
	  int ko = (int)(Math.random()*56) +45;// <= 풀네임으로 써야함 즉, 알파벳은 안됨. ex)"korScore"
	  int en = (int)(Math.random()*56) +45;
	  int ma = (int)(Math.random()*56) +45;
	  int to = ko + en + ma;
	   double av = (double)(to)/3;
	   /*등호 오른쪽먼저 계산하기 때문에 
	                                  *double av = (double)(to)/3;으로 하거나, to/3.0;으로 해야 함.
	                                  */ 
	    char gr = '0' ;/*char은 2바이트인데 '0'이라는 int변수도 가능한 이유는
	                    *char은 int로사용됨
	                    */
			  if(av>=90) gr='A';
			  else if (80<=av&av<90) gr='B';//위에서 이미 90보다 작은것들을 내렸기 때문에 "av<90"은 필요가 없는것.
			  else if (70<=av&av<80) gr='C';
			  else if (60<=av&av<70) gr='D';
			  else gr='F';
	  
                 System.out.println(na+ " 국어점수:"+ko+". 영어점수:"+en+". 수학점수:"+ma+".");  /*"/t"를 쓰면 띄어쓰기,
                                                                                                  *"/n"을 쓰면 줄바꾸기
                                                                                                  */
                 System.out.println("총점:"+to+". 평균:"+av+ ". 학점"+gr+".");
      /*만약 소수점 둘째자리까지 하려면
       * av = (int)(av*100)/100.0 을 해줘야함
       */
                 
                 av = (int)(av*100)/100.0; //??모르겠다 왜 안되냐
                 System.out.println(av);
          
      //////////////////////////////////////////////////////////////////////////////////////////
       int i = (int)av;//굳이 필요가 없었던것같다
       char a = 'A';
       switch(i) /*switch((int)av/10))으로 맞추고 
       			  *case 10 :
       			  *case 9:
       			  *		gr='A'
       			  *break; 이런식으로 이어서 함
       			  */
       {
        case 90,91,92,93,94,95,96,97,98,99,100 : a='A'; break;
        case 80,81,82,83,84,85,86,87,88,89 : a='B'; break;
        case 70,71,72,73,74,75,76,77,78,79 : a='C'; break;
        case 60,61,62,63,64,65,66,67,68,69 : a='D'; break;
         default : a='F';
       }
           System.out.println(na+ " 국어점수:"+ko+". 영어점수:"+en+". 수학점수:"+ma+".");
           System.out.println("총점:"+to+". 평균:"+i+ ". 학점"+a);
         
           
          
           
       
      }
      
	}

	


