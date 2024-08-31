package com.java;

public class ZigZagConversion {
	
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3));
	}
	public static String convert(String s, int numRows) {
        String result = "";
		int x = s.length();
		int temp = 0;
        while(x>0) {
        	if(temp<numRows) {
        		result = result + String.valueOf(s.charAt(temp));
        		temp++;
        	}else{
        		result = result + String.valueOf(s.charAt(temp));
        		temp--;
        	}
        	System.out.println(temp);
        	x--;
        }
        
		return result;
    }
}

//PAYPALISHIRING
//0123456789
//01210121012101

//PAYPALISHIRING
//0123456789
//012321012321