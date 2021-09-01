package com.green.biz;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchMaxTest {

	@Test
	public void testSearchMax() {
		
		int[] arr1 = {1, 3, 4, 2};
        int[] arr2 = {-12, -1, -3, -4, -2};


		CalcUtil calc = new CalcUtil();
		
		assertEquals("CalcUtil max", 4, calc.searchMax(arr1)); 
		assertEquals("CalcUitl max",-1, calc.searchMax(arr2));
	}

}
