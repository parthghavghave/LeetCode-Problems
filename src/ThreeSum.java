import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(nums));
	}

	public static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> l = new ArrayList<Integer>();
						l.add(nums[i]);
						l.add(nums[j]);
						l.add(nums[k]);
						if (result.isEmpty())
							result.add(l);
						else {
							if (!isPresent(result, l))
								result.add(l);
						}
					}
				}
			}
		}
		return result;
	}

	public static boolean isPresent(List<List<Integer>> result, List<Integer> l) {
		for (List<Integer> le : result) {
			System.out.println(le +" - "+ l);	
			if (le.equals(l))
				return true;
		}
		return false;
	}
}
