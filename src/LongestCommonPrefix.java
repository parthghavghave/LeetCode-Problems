
public class LongestCommonPrefix {

	public static void main(String[] args) {

		String s[] = { "flower","flower","flower","flower" };
		System.out.println(longestCommonPrefix(s));
	}

	public static String longestCommonPrefix(String[] strs) {

		String result = strs[0];

		for (int i = 1; i < strs.length; i++) {
			int j = 0;
			if (result.equals(""))
				return "";

			while (j < result.length() && j < strs[i].length() && result.charAt(j) == strs[i].charAt(j))
				j++;

			result = result.substring(0, j);
		}

		return result;

	}
}
