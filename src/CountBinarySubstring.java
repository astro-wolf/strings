/**
 * https://leetcode.com/problems/count-binary-substrings/description/
 *
 * Give a string s, count the number of non-empty (contiguous) substrings that have
 * the same number of 0's and 1's, and all the 0's and all the 1's in these substrings
 * are grouped consecutively.
 *
 * Substrings that occur multiple times are counted the number of times they occur.
 *
 * Example 1:
 * Input: "00110011"
 * Output: 6
 * Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's:
 * "0011", "01", "1100", "10", "0011", and "01".
 *
 * Notice that some of these substrings repeat and are counted the number of times they occur.
 *
 * Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 */
public class CountBinarySubstring {

    public static void main(String[] args) {
        CountBinarySubstring countBinarySubstring = new CountBinarySubstring();
        countBinarySubstring.countBinarySubstrings("10101");
    }

    public int countBinarySubstrings(String s) {
        int count = 0, firstCharCount = 0, secondCharCount = 0;
        char firstChar;
        for(int i = 0; i < s.length(); ) {
            int j = i;
            firstChar = s.charAt(i);
            while(j < s.length() && s.charAt(j) == firstChar) {
                firstCharCount++;
                j++;
                i++;
            }
            while(j < s.length() && s.charAt(j) != firstChar) {
                secondCharCount++;
                j++;
            }
            count += Math.min(firstCharCount, secondCharCount);
            firstCharCount = 0;
            secondCharCount = 0;
        }
        return count;
    }

}
