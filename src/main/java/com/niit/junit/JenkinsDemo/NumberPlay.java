package com.niit.junit.JenkinsDemo;

public class NumberPlay {

	public int largeNumber(int a, int b) {
		int large = 0;
		if (a > b) {
			large = a;
		} else {
			large = b;
		}
		return large;
	}

	public boolean isPrime(int n) {
		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	public boolean isPalindrome(String str) {
		String reverse = "";
		int n = str.length();
		for (int i = n - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (str.equalsIgnoreCase(reverse)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int sumOfArrayElements(int[] arr) 
    { 
        int sum = 0; // initialize sum 
        int i; 
       
        // Iterate through all elements and add them to sum 
        for (i = 0; i < arr.length; i++) 
           sum +=  arr[i]; 
       
        return sum; 
    } 
}
