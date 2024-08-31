package com.java;

public class Palandrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}
	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		int z = 0;
		int y = s.length()-1;
		while(z<y) {
			if(s.charAt(z)!=s.charAt(y)) {
				return false;
			}
			z++;
			y--;
		}
		return true;
    }
}
