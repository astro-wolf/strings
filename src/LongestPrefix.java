/**
 * Created by Vishwas on 24-04-2018.
 */
public class LongestPrefix {

    public static void main(String args[]) {
        LongestPrefix longestPrefix = new LongestPrefix();
        longestPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"});
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        String res = strs[0];
        for(int idx = 1; idx < strs.length; idx++) {
            res = compareStrings(res, strs[idx]);
            if(res.isEmpty())
                return "";
        }
        return res;
    }

    private String compareStrings(String st1, String st2) {
        StringBuilder resBuilder = new StringBuilder();
        int length = st1.length() >= st2.length() ? st2.length() : st1.length();
        for(int idx = 0; idx < length; idx++) {
            if (st1.charAt(idx) == st2.charAt(idx))
                resBuilder.append(String.valueOf(st1.charAt(idx)));
            else if (idx == 0)
                return "";
        }
        return resBuilder.toString();
    }

}
