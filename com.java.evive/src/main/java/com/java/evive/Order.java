package com.java.evive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Order {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nMenu Option:\n");
		System.out.println("Enter either Breakfast, Lunch or Dinner\n");
		System.out.println("Breakfast Menu:\n");
		System.out.println("1: Eggs, 2: Toast, 3: Coffee. Only multiple coffee can be ordered.\n");
		System.out.println("Lunch Menu:\n");
		System.out.println("1: Sandwich, 2: Chips, 3: Soda. Only multiple sides can be ordered.\n");
		System.out.println("Dinner Menu:\n");
		System.out.println("1: Steak, 2: Potatoes, 3: Wine, 4: Cake. Dessert must be ordered and Water is provided by us.\n");
		System.out.println("Each order must contain a main and a side   \n");
		System.out.println("Typing meal(breakfast, lunch, dinner) is case insensitive as well as other special character(other than letters and numbers) and whitespaces are trimmed\n");
		String input = scan.nextLine();
		
		String mealType = "";
		int i=0;
		
		for(; i<input.length(); i++) {
			if(input.charAt(i) == ' ') break;
			 mealType += input.charAt(i);
		}
		
		input = input.replaceAll("[^a-zA-Z0-9]", " ");
		input = input.replaceAll("\\s", "");
		mealType = mealType.toLowerCase();
				
		List<Character> processedInputOrder = new ArrayList<Character>();
		
		ProcessInput pi = new ProcessInput();
		processedInputOrder = pi.getIds(input, i, mealType);
		
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char id: processedInputOrder) {
			
			Integer integer = map.get(id);
            if (integer == null)
                map.put(id, 1);
            else {
                map.put(id, integer + 1);
            }
		}
		String ans = "";
		if(mealType.equals("breakfast")) {
			Breakfast bf = new Breakfast();
			ans = bf.output(map);
		} else if(mealType.equals("lunch")) {
			Lunch ln = new Lunch();
			ans = ln.output(map);
		} else if(mealType.equals("dinner")) {
			Dinner dn = new Dinner();
			ans = dn.output(map);
		} else {
			System.out.println("Wrong Input");
			System.exit(0);
		}
		System.out.println(ans);
		scan.close();

	}

}
