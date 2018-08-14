import java.util.HashMap;

public class NoRepetitionSubstring {
    public static void main(String[] args) {
        NoRepetitionSubstring bean = new NoRepetitionSubstring();
        String s = "abcabcbb";
        int a = bean.lengthOfLongestSubstring(s);
        System.out.println(a);
    }
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        for(int i =0; i < length; i++){
            char a = s.charAt(i);
            if(map.containsKey(a)) max = i - map.get(a);
            else map.put(a,i);
        }
        return max;
    }
}
