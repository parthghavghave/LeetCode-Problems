import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {
	public static void main(String[] args) {

		String digit = "234";
		System.out.println(letterCombinations(digit));

	}

	public static List<String> letterCombinations(String digits) {

		List<String> result = new ArrayList<>();
		if (digits == null || digits.length() == 0) {
			return result;
		}

		Map<Character, String> digitLetters = new HashMap<>();
		digitLetters.put('2', "abc");
		digitLetters.put('3', "def");
		digitLetters.put('4', "ghi");
		digitLetters.put('5', "jkl");
		digitLetters.put('6', "mno");
		digitLetters.put('7', "pqrs");
		digitLetters.put('8', "tuv");
		digitLetters.put('9', "wxyz");

		generateCombinations(digits, 0, new StringBuilder(), result, digitLetters);

		return result;
	}

	private static void generateCombinations(String digits, int index, StringBuilder current, List<String> result,
			Map<Character, String> digitLetters) {
		if (index == digits.length()) {
			result.add(current.toString());
			return;
		}

		String letters = digitLetters.get(digits.charAt(index));

		for (char letter : letters.toCharArray()) {
			current.append(letter);
			generateCombinations(digits, index + 1, current, result, digitLetters);
			current.deleteCharAt(current.length() - 1);
		}
	}
}
