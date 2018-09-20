public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean isValid = validPalindrome.isPalindrome("A man, a plan, a canal: Panama");
        System.out.print(isValid);
    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < s.length() - 1 && !Character.isDigit(s.charAt(i)) && (!Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' '))
                i++;
            while (j > 0 && !Character.isDigit(s.charAt(j))  && (!Character.isAlphabetic(s.charAt(j)) || s.charAt(j) == ' '))
                j--;
            if(i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
            if(i < j) {
                i++;
                j--;
            }
        }
        return true;
    }

}
