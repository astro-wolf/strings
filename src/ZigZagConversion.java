/**
 * https://leetcode.com/problems/zigzag-conversion/description/
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 *
 * Example 1:
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 *
 * Example 2:
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
public class ZigZagConversion {

    public static void main(String[] args) {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String converted = zigZagConversion.convert("PAYPALISHIRING", 3);
        System.out.print(converted);
    }

    public String convert(String s, int numRows) {
        StringBuffer[] rootBuilder = new StringBuffer[numRows];
        for (int idx = 0; idx < numRows; idx++)
            rootBuilder[idx] = new StringBuffer();
        int i = 0;
        while (i < s.length()) {
            for (int idx = 0; idx < numRows && i < s.length(); idx++)
                rootBuilder[idx].append(s.charAt(i++));
            for (int idx = numRows - 2; idx >= 1 && i < s.length(); idx--)
                rootBuilder[idx].append(s.charAt(i++));
        }
        for (int idx = 1; idx < rootBuilder.length; idx++)
            rootBuilder[0].append(rootBuilder[idx]);
        return rootBuilder[0].toString();
    }

}
