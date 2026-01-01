import java.util.*;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    static void backtrack(String s, int start, List<String> current, List<List<String>> result) {
        if (start == s.length()) { // base case
            result.add(new ArrayList<>(current)); // save snapshot
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) { // only choose palindrome
                current.add(s.substring(start, end + 1)); // choose
                backtrack(s, end + 1, current, result);  // recurse for remaining string
                current.remove(current.size() - 1);      // backtrack
            }
        }
    }

    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
