package com.java.evive;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class LunchTest {
	
	Lunch ln = new Lunch();
	@Test
	public void test() {
//		fail("Not yet implemented");
		
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();		
		map.put('1', 1);
		map.put('2', 1);
		map.put('3', 1);
		System.out.println("Lunch 1,2,3");
		System.out.println(ln.output(map));
		assertEquals("Sandwich, Chips, Soda\n", ln.output(map));
		
		map.clear();
		
		map.put('1', 1);
		map.put('2', 1);
		System.out.println("Lunch 1,2");
		System.out.println(ln.output(map));
		assertEquals("Sandwich, Chips, Water\n", ln.output(map));
		
		map.clear();
		
		map.put('1', 2);
		map.put('2', 1);
		map.put('3', 1);
		System.out.println("Lunch 1,1,2,3");
		System.out.println(ln.output(map));
		assertEquals("Unable to process: Sandwich can not be ordered more than once\n", ln.output(map));
		
		map.clear();
		map.put('1', 1);
		map.put('2', 2);
		System.out.println("Lunch 1,2,2");
		System.out.println(ln.output(map));
		assertEquals("Sandwich, Chips(2), Water\n", ln.output(map));
		
		map.clear();
		System.out.println("Lunch");
		System.out.println(ln.output(map));
		assertEquals("Unable to process: Main is missing, Side is missing\n", ln.output(map));
	}
}
