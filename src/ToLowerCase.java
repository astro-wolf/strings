/**
 * https://leetcode.com/problems/to-lower-case/description/
 *
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 Example 1:
 Input: "Hello"
 Output: "hello"

 Example 2:
 Input: "here"
 Output: "here"
 Example 3:

 Input: "LOVELY"
 Output: "lovely"
 */
public class ToLowerCase {

    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();
        String loweredString = toLowerCase.toLowerCase("helo");
        System.out.print(loweredString);
    }

    public String toLowerCase(String str) {
        char[] strArr = str.toCharArray();
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i] >= 65 && strArr[i] <= 90) {
                strArr[i] = (char) (strArr[i] + 32);
            }
        }
        return String.valueOf(strArr);
    }

}
