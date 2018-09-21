import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        ransomNote.canConstruct("aa", "aab");
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.isEmpty() && magazine.isEmpty())
            return true;
        HashMap<Character, Integer> countingMap = new HashMap<>();
        for(char c : ransomNote.toCharArray()) {
            if(countingMap.containsKey(c))
                countingMap.put(c, countingMap.get(c) + 1);
            else
                countingMap.put(c, 1);
        }
        for(char c : magazine.toCharArray()) {
            if(countingMap.containsKey(c))
                countingMap.put(c, countingMap.get(c) - 1);
        }
        for(Object v : countingMap.values()) {
            if((int)v > 0)
                return false;
        }
        return true;
    }

}
