package com.java;
import java.util.HashSet;

public class LongestSubstringWithNonRepeat {
	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		int result = 0;
		int i=0,j=0;
		HashSet<Character> set = new HashSet<>();
		
		while(j<s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				result = Math.max(result, j-i);
			}
			else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		
		return result;
	}
}
