import java.util.HashMap;

public class NoRepetitionSubstring {
    public static void main(String[] args) {
        NoRepetitionSubstring bean = new NoRepetitionSubstring();
        String s = " ";
        int a = bean.lengthOfLongestSubstring(s);
        System.out.println(a);
    }

    /**
     * for the longest Substring without no repetition
     * init string : 1 2 3 4 5 6 7 8 9 10 11...
     * start curson  *
     * if 3 == 1
     * while startcursor move to 3 as bellow:
     *                   *
     * so the length is the end-cursor substract start-cursor
     */
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0 ;
        int start = 0;
        for(int i = 0; i < length; i++)
        {
            Character character = s.charAt(i);
            if(map.containsKey(character))  start = Math.max(map.get(character), start);
            max = Math.max(i - start + 1, max);
            map.put(character , i + 1);
        }
        return max;
    }
}
