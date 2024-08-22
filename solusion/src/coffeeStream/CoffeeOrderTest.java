package coffeeStream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CoffeeOrderTest 
{

	public CoffeeOrderTest ()
	{
		//List<String> coffees = Arrays.asList();
		//List.of로도 가능함 					
		
		//stream 생성하고 필터로 endsWith("o")
		//sorted 하면 정렬
		//distinct	중복제거
		//collect(Collectors.toList)로 리스트로 돌리기. 
		
		List<String> coffees = List.of("Cappuccino","Americano"
										,"Espresso","Caramel Macchiato"
										,"Mocha","Cappuccino"
										,"Espresso","Latte");
		List<String> coffeeEndionIn = coffees.stream()
										.sorted()
									  .sorted((o1,o2)->{
										
										  if(o1.endsWith("o") && !o2.endsWith("o"))
										 {
											 return -1;  
										 }
										  else if(!o1.endsWith("o")&& o2.endsWith("o"))
										  {
											  return 1;
										  }
										  else
										  {
											  return 0;
										  }
									  })
									  .distinct()
									  .collect(Collectors.toList());
		
		System.out.println(coffeeEndionIn);
	}
	
	public static void main(String[] args) 
	{
		new CoffeeOrderTest ();
		
	}
}
