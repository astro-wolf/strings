/**
 * https://leetcode.com/problems/number-of-segments-in-a-string/description/
 *
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 *
 * Please note that the string does not contain any non-printable characters.
 *
 * Example:
 *
 * Input: "Hello, my name is John"
 * Output: 5
 */
public class NumberOfSegments {

    public static void main(String[] args) {
        NumberOfSegments numberOfSegments = new NumberOfSegments();
        int count = numberOfSegments.countSegments(" ");
        System.out.print(count);
    }

    public int countSegments(String s) {
        if (s.isEmpty() || s.trim().isEmpty()) return 0;
        s = s.trim();
        int res = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && (i == 0 || s.charAt(i - 1) != ' '))
                res++;
        }
        return res;
    }

}
