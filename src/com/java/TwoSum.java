package com.java;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		
		int[] output = twoSum(nums, target);
		
		System.out.println(output[0]+" "+output[1]);
	}
	public static int[] twoSum(int[] nums, int target) {
		int[] result = {0, 0};
		for (int i = 0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				if((nums[i]+nums[j])==target) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		
		return result;
        
    }
}
