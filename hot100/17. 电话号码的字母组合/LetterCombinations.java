import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        String digits = "23";
        List<String> result = new LetterCombinations().letterCombinations(digits);
        System.out.println(result);
    }

    private List<String> letterCombinations(String digits) {
        String[] map = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        dfs(digits, 0, map, "", result);
        return result;
    }

    private void dfs(String digits, int i, String[] map, String s, List<String> result) {
        if (i == digits.length()) {
            result.add(s);
            return;
        }
        String letters = map[digits.charAt(i) - '2'];
        for (int j = 0; j < letters.length(); j++) {
            dfs(digits, i + 1, map, s + letters.charAt(j), result);
        }
    }
}
