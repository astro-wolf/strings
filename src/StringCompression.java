public class StringCompression {

    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        int count = stringCompression.compress(new char[]{'a', 'b', 'b'});
        System.out.print(count);
    }

    public int compress(char[] chars) {
        if (chars.length == 1)
            return 1;
        int currCount = 0, currIdx = 0;
        for (int i = 0; i < chars.length; i++) {
            chars[currIdx] = chars[i];
            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
                currCount++;
                if (currCount > 1) {
                    for (char c : String.valueOf(currCount).toCharArray()) {
                        chars[++currIdx] = c;
                    }
                }
                currCount = 0;
                currIdx++;
            } else {
                currCount++;
            }
        }
        return currIdx;
    }

}
