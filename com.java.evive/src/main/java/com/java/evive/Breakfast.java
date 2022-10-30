package com.java.evive;

import java.util.HashMap;

public class Breakfast {
	String output(HashMap<Character, Integer> map) {
//		System.out.println("hello from Breakfast");
			
        int mainBreakfast = map.get('1') == null? 0 : map.get('1');
        int sideBreakfast = map.get('2') == null? 0 : map.get('2');
        String ans ="";
        if(mainBreakfast==0 && sideBreakfast==0) {
            ans = "Unable to process: Main and Side are missing\n";
            return ans;
        } else if(mainBreakfast==0){
        	ans = "Unable to process: Main is missing\n";
        	return ans;
        } else if(sideBreakfast==0){
        	ans = "Unable to process: Side is missing\n";
            return ans;
        } else if(mainBreakfast>1 && sideBreakfast>1){
        	ans = "Unable to process: Eggs and Toasts can not be ordered more than once.\n";
        	return ans;
        }else if(mainBreakfast>1){
        	ans = "Unable to process: Eggs can not be ordered more than once.\n";
        	return ans;
        }else if(sideBreakfast>1){
        	ans = "Unable to process: Side can not be ordered more than once.\n";
        	return ans;
        }
        int coffeeCount = map.get('3')==null? 0: map.get('3');
        
        ans  = "Eggs, Toast";
        if(coffeeCount==1){
            ans += ", Coffee\n";
        } 
        else if(coffeeCount>1){
        	ans += ", Coffee(";
        	ans += coffeeCount;
        	ans += ")\n";
        }
        return ans;
	}
}
