package com.java.evive;

import java.util.HashMap;

public class Lunch {
	String output(HashMap<Character, Integer> map) {
//		System.out.println("hello from Lunch");
		
		int mainLunchCount = map.get('1') == null? 0 : map.get('1');
		int sideLunchCount = map.get('2') == null? 0 : map.get('2');
		
        if(mainLunchCount==0 && sideLunchCount==0) {
            return "Unable to process: Main is missing, Side is missing\n";
        } else if(mainLunchCount==0){
        	return "Unable to process: Main is missing\n";
        } else if(sideLunchCount==0){
        	return "Unable to process: Side is missing\n";
        } else if(mainLunchCount>1){
        	return "Unable to process: Sandwich can not be ordered more than once\n";
        }
        String ans = "";
        ans += "Sandwich";
        if(sideLunchCount==1){
        	ans += ", Chips";
        } 
        else if(sideLunchCount>1){
        	ans += ", Chips(" + sideLunchCount + ")";
        }
        
        int sodaCount= map.get('3')==null? 0: map.get('3');
        
        if(sodaCount==0){
        	ans += ", Water\n";
        } else{
        	ans += ", Soda\n";
        }
        
        return ans;
	}

}
