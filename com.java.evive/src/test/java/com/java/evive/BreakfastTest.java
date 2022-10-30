package com.java.evive;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class BreakfastTest {
	
	Breakfast bf = new Breakfast();

	@Test
	public void testBreakfast() {
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();		
		map.put('1', 1);
		map.put('2', 1);
		map.put('3', 1);
		System.out.println("Breakfast 1,2,3");
		System.out.println(bf.output(map));
		assertEquals("Eggs, Toast, Coffee\n", bf.output(map));
		
		map.clear();
		
		map.put('1', 1);
		map.put('2', 1);
		map.put('3', 3);
		System.out.println("Breakfast 1,2,3,3,3");
		System.out.println(bf.output(map));
		assertEquals("Eggs, Toast, Coffee(3)\n", bf.output(map));
		
		map.clear();
		map.put('1', 1);
		System.out.println("Breakfast 1");
		System.out.println(bf.output(map));
		assertEquals("Unable to process: Side is missing\n", bf.output(map));
		
		
	}

}
