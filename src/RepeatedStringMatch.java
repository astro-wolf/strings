/**
 * https://leetcode.com/problems/repeated-string-match/description/
 *
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it.
 * If no such solution, return -1.
 *
 * For example, with A = "abcd" and B = "cdabcdab".
 * Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it;
 * and B is not a substring of A repeated two times ("abcdabcd").
 *
 * Note:
 * The length of A and B will be between 1 and 10000.
 */
public class RepeatedStringMatch {

    public static void main(String[] args) {
        RepeatedStringMatch repeatedStringMatch = new RepeatedStringMatch();
        int count = repeatedStringMatch.repeatedStringMatch("aaaaaaaaaaaaaaaaaaaaaab", "ba");
        System.out.print(count);
    }

    public int repeatedStringMatch(String A, String B) {
        StringBuilder aBuilder = new StringBuilder(A);
        while(aBuilder.length() < B.length()) {
            aBuilder.append(A);
        }
        return aBuilder.toString().contains(B) ? aBuilder.length() / A.length() :
                aBuilder.append(A).toString().contains(B) ? aBuilder.length() / A.length() : -1;
    }

}
