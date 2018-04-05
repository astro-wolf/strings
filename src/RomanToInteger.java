/**
 * Created by Vishwas on 05-04-2018.
 */
public class RomanToInteger {

    public static void main(String args[]) {
        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.romanToInt("xxxviii");
    }

    public int romanToInt(String s) {
        int res = 0;
        s = s.toLowerCase();
        for (int i = s.length() - 1; i >= 0; i--) {
            Character subRoman = s.charAt(i);
            Character preSubRoman = ' ';
            if (i > 0)
                preSubRoman = s.charAt(i - 1);
            if ((subRoman.equals('v') || subRoman.equals('x')) && preSubRoman.equals('i')) {
                i--;
                StringBuilder subRomanBuilder = new StringBuilder();
                subRomanBuilder.append(preSubRoman);
                subRomanBuilder.append(subRoman);
                res += getIntForSubRoman(subRomanBuilder.toString());
            } else {
                res += getIntForSubRoman(subRoman.toString());
            }
        }
        return res;
    }

    private int getIntForSubRoman(String subRoman) {
        switch (subRoman) {
            case "i":
                return 1;
            case "iv":
                return 4;
            case "v":
                return 5;
            case "ix":
                return 9;
            case "x":
                return 10;
            default:
                return 0;
        }
    }
}
