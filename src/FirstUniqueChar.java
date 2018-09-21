import java.util.HashMap;

public class FirstUniqueChar {

    public static void main(String[] args) {
        FirstUniqueChar firstUniqueChar = new FirstUniqueChar();
        firstUniqueChar.firstUniqChar("loveleetcode");
    }

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> countingMap = new HashMap<>();
        for(char c : s.toCharArray()) {
            if(countingMap.containsKey(c))
                countingMap.put(c, countingMap.get(c) + 1);
            else
                countingMap.put(c, 1);
        }
        for(int i = 0; i < s.length(); i++) {
            if(countingMap.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

}
