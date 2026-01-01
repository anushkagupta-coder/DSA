import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhoneNum {
    
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;

        // Mapping digits to letters
        String[] map = {
            "", "",     // 0,1
            "abc",      // 2
            "def",      // 3
            "ghi",      // 4
            "jkl",      // 5
            "mno",      // 6
            "pqrs",     // 7
            "tuv",      // 8
            "wxyz"      // 9
        };

        // Start backtracking
        backtrack(digits, 0, "", map, result);
        return result;
    }

    private static void backtrack(String digits, int index, String current, String[] map, List<String> result) {
        // Base case: if we have reached the end of digits
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        // Get letters for the current digit
        String letters = map[digits.charAt(index) - '0'];

        // Try each letter
        for (char ch : letters.toCharArray()) {
            backtrack(digits, index + 1, current + ch, map, result);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> res = letterCombinations(digits);
        System.out.println(res);
    }
}
