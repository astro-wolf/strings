public class ReverseWords {

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        String reversed = reverseWords.reverseWords("Vishwas");
        System.out.print(reversed);
    }

    public String reverseWords(String s) {
        if(s == null || s.isEmpty())
            return s;
        if(s.length() == 1)
            return s;
        s = s.trim();
        char[] str = s.toCharArray();
        if(!s.contains(" ")) {
            reverseChars(str, 0, str.length - 1);
            return String.valueOf(str);
        }
        int i = 0;
        for(int idx = 0; idx < str.length; idx++) {
            if(str[idx] == ' ') {
                reverseChars(str, i, idx - 1);
                i = idx + 1;
            }
        }
        if(i < str.length - 1) {
            reverseChars(str, i, str.length - 1);
        }
        return String.valueOf(str);
    }

    private void reverseChars(char[] arr, int i, int j) {
        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
