package com.niit.junit.JenkinsDemo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;



public class NumberPlayTest {

	private static NumberPlay numberPlay;
	
	@BeforeClass
	public static void init()
	{
		numberPlay = new NumberPlay();
	}
	
	@Test
	public void test_larger_number()
	{
		int large= numberPlay.largeNumber(10, 21);
		assertEquals(21, large);
	}
	
	@Test
	public void test_prime_number()
	{
		boolean isPrime = numberPlay.isPrime(11);
		assertEquals(true, isPrime);
	}

	@Test
	public void test_string_palendrome()
	{
		String str = "racecar";
		assertEquals(true, numberPlay.isPalindrome(str));
	}
	
	@Test
	public void test_sum_of_array_elements()
	{
		int[] array= {10,2,34,6,89,11};
		int sum = numberPlay.sumOfArrayElements(array);
		
		assertEquals(152, sum);
	}
}