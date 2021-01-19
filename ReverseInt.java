package com.demo.ReverseInt;

/*
 * Reverse integer
 */
public class ReverseInt {
	
	public static int reverseInt(int x) {
		int reversedInt = 0;
		while( x != 0 ){
			int pop = (x % 10);
			x = x/10;
			
			if(reversedInt > Integer.MAX_VALUE/10 || reversedInt < Integer.MIN_VALUE/10){
                return 0;
            }
			reversedInt = (10 * reversedInt) + pop;
		}
		return reversedInt;
	}
	
	public static void main(String[] args) {
		int x = -123;
		System.out.println(reverseInt(x));
	}

}
