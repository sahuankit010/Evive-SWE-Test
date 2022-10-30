package com.java.evive;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class DinnerTest {

	Dinner dn = new Dinner();
	@Test
	public void test() {
//		fail("Not yet implemented");
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();		
		map.put('1', 1);
		map.put('2', 1);
		map.put('3', 1);
		map.put('4', 1);
		System.out.println("Dinner 1,2,3,4");
		System.out.println(dn.output(map));
		assertEquals("Steak, Potatoes, Wine, Water, Cake\n", dn.output(map));
		
		map.clear();
		
		map.put('1', 1);
		map.put('2', 1);
		map.put('3', 3);
		System.out.println("Dinner 1,2,3");
		System.out.println(dn.output(map));
		assertEquals("Unable to process: Dessert is missing\n", dn.output(map));
		
	}

}
