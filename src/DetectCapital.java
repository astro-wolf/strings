/**
 * https://leetcode.com/problems/detect-capital/description/
 *
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 *
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * *Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 *
 * Example 1:
 * Input: "USA"
 * Output: True
 *
 * Example 2:
 * Input: "FlaG"
 * Output: False
 *
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */
public class DetectCapital {

    public static void main(String[] args) {
        DetectCapital detectCapital = new DetectCapital();
        boolean isProperlyCapitalized = detectCapital.detectCapitalUse("USAASDFf");
        System.out.print(isProperlyCapitalized);
    }

    public boolean detectCapitalUse(String word) {
        if (word.length() == 1)
            return true;
        int upperLimit, lowerLimit;
        if (word.charAt(0) >= 97
                || (word.charAt(0) >= 65 && word.charAt(0) <= 90 && word.charAt(1) >= 97)) {
            upperLimit = 122;
            lowerLimit = 97;
        } else {
            upperLimit = 90;
            lowerLimit = 65;
        }
        for(int i = 1; i < word.length(); i++) {
            if(word.charAt(i) < lowerLimit || word.charAt(i) > upperLimit)
                return false;
        }
        return true;
    }

}
