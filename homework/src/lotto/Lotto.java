package lotto;

import java.util.Collections;
import java.util.Set; 
import java.util.TreeSet;

public class Lotto 
{
	
	
	
	//Set<Integer> num = new TreeSet<Integer>();	올림차순
	Set<Integer> num = new TreeSet<Integer>(Collections.reverseOrder());		내림차순
	
	
			
	public Lotto() 
	{	
		
		while(num.size()==6)
		{	
			int ran = (int)(Math.random()*45+1);
			
			num.add(ran);
				
			
			
		}
		System.out.println(num);
		
	}
	
	
	
	public static void main(String[] args) 
	{	
		
		
		new Lotto();
		
	}
	
	
}
