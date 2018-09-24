public class RepeatedSubStringPattern {

    public static void main(String[] args) {
        RepeatedSubStringPattern repeatedSubStringPattern = new RepeatedSubStringPattern();
        boolean repeated = repeatedSubStringPattern.repeatedSubstringPattern("abcabcdabcabcd");
        System.out.print(repeated);
    }

    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }

}
