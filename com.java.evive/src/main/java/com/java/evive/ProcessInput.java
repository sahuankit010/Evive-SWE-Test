package com.java.evive;

import java.util.ArrayList;
import java.util.List;

public class ProcessInput {
	public List<Character> getIds (String order, int index, String meal){
		
		List<Character> processedOrder = new ArrayList<Character>();
	
		if(meal.equals("breakfast")) {
			
			for(int i=index; i<order.length(); i++) {
				if(order.charAt(i) == '1' || order.charAt(i) == '2' || order.charAt(i) == '3')
					processedOrder.add(order.charAt(i));
				else {
					System.out.println("Wrong Input");
					System.exit(0);
				}
			}
			
		} else if(meal.equals("lunch")) {
			for(int i=index; i<order.length(); i++) {
				if(order.charAt(i) == '1' || order.charAt(i) == '2' || order.charAt(i) == '3')
					processedOrder.add(order.charAt(i));
				else {
					System.out.println("Wrong Input");
					System.exit(0);
				}
			}
			
		}else if (meal.equals("dinner")) {
			for(int i=index; i<order.length(); i++) {
				if(order.charAt(i) == '1' || order.charAt(i) == '2' || order.charAt(i) == '3' || order.charAt(i) == '4')
					processedOrder.add(order.charAt(i));
				else {
					System.out.println("Wrong Input");
					System.exit(0);
				}
			}
		}
		
		return processedOrder;
	}

}
