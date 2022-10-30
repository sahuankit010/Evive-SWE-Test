package com.java.evive;

import java.util.HashMap;

public class Dinner {
	

	String output(HashMap<Character, Integer> map) {
		
		int mainDinnerCount = map.get('1') == null? 0: map.get('1');
        int sideDinnerCount = map.get('2') == null? 0: map.get('2');
        int wineCount = map.get('3') == null? 0: map.get('3');
        int cakeCount = map.get('4') == null? 0: map.get('4');
        String ans = "";
        
        if(mainDinnerCount==0 && sideDinnerCount==0) {
            return "Unable to process: Main is missing, Side is missing\n";
        } else if(mainDinnerCount==0){
        	return "Unable to process: Main is missing\n";
        } else if(sideDinnerCount==0){
        	return "Unable to process: Side is missing\n";
        } else if(cakeCount==0){
        	return "Unable to process: Dessert is missing\n";
        } else if(mainDinnerCount>1){
        	return "Unable to process: Steak can not be ordered more than once.\n";
        }else if(sideDinnerCount>1){
        	return "Unable to process: Potatoes can not be ordered more than once.\n";
        }else if(wineCount>1){
        	return "Unable to process: Wine can not be ordered more than once.\n";
        }else if(cakeCount>1){
        	 return"Unable to process: Cake can not be ordered more than once.\n";
        }
        ans += "Steak, Potatoes";
        if(wineCount>=1){
        	ans += ", Wine, Water, Cake\n";
        }else{
        	ans += ", Water, Cake\n";
        }
        return ans;
	}
}
