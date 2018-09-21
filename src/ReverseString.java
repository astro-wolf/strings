public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String res = reverseString.reverseString("as");
        System.out.print(res);
    }

    public String reverseString(String s) {
        if (s.isEmpty() || s.length() == 1)
            return s;
        StringBuilder resBuilder = new StringBuilder("");
        int i = s.length() - 1;
        while(i >= 0) {
            resBuilder.append(s.charAt(i));
            i--;
        }
        return resBuilder.toString();
    }

}
