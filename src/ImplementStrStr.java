public class ImplementStrStr {

    public static void main(String[] args) {
        ImplementStrStr implementStrStr = new ImplementStrStr();
        int idx = implementStrStr.strStr("", "aaaaa");
        System.out.print(idx);
    }

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty() && haystack.isEmpty())
            return 0;
        int i = 0, j = 0;
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        while (i < haystack.length()) {
            while (j < n.length && i + j < h.length && h[i + j] == n[j]) {
                j = j + 1;
            }
            if (j == n.length)
                return i;
            j = 0;
            i = i + 1;
        }
        return -1;
    }

}
