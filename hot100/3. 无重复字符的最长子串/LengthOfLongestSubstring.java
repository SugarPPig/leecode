import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        // 无重复字符的最长子串
        String s = "abba";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    private static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            map.put(alpha, end + 1);
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}
