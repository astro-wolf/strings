public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int count = lengthOfLastWord.lengthOfLastWord("hello world");
        System.out.print(count);
    }

    public int lengthOfLastWord(String s) {
        if(s.isEmpty())
            return 0;
        String[] strArr = s.trim().split("\\s+");
        if(strArr.length == 1)
            return strArr[0].length();
        return strArr[strArr.length - 1].length();
    }

}
