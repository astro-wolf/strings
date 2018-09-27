public class ReverseStringI {

    public static void main(String[] args) {
        ReverseStringI reverseStringI = new ReverseStringI();
        String reversed = reverseStringI.reverseStr("abcdefghij", 4);
        System.out.print(reversed);
    }

    public String reverseStr(String s, int k) {
        if(s == null || s.isEmpty())
            return s;
        if(s.length() == 1)
            return s;
        char[] str = s.toCharArray();
        if(s.length() < k) {
            reverseChars(str, 0, str.length - 1);
            return String.valueOf(str);
        }
        boolean reverse = true;
        for(int idx = 0; idx < str.length; idx += k) {
            if(reverse) {
                int i = idx, j = idx + k - 1;
                if(j >= str.length)
                    j = str.length - 1;
                reverseChars(str, i, j);
                reverse = false;
            } else {
                reverse = true;
            }
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
