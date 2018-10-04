import java.util.HashMap;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestUniqueSubstring {

    public static void main(String[] args) {
        LongestUniqueSubstring longestUniqueSubstring = new LongestUniqueSubstring();
        int count = longestUniqueSubstring.lengthOfLongestSubstring("dvdf");
        System.out.print(count);
    }

    public int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        HashMap<Character, Integer> countMap = new HashMap<>();
        for(int i = 0, j = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(countMap.containsKey(c))
                j = Math.max(j, countMap.get(c) + 1);
            countMap.put(c, i);
            maxCount = Math.max(maxCount, i - j + 1);
        }
        return maxCount;
    }

}
