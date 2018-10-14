public class longestPalindromeTest {
    public static void main(String[] args) {
        String str = "abcba";
        String result = longestPalindrome(str);
        System.out.println(result);
    }
//dynamic programing
    private static String longestPalindrome(String s) {
        int length = s.length();
        if(length == 0 ) return s;
        String longestStr = s.substring(0,1);
        for(int i =0; i < length; i++)
        {
            String p = findmaxsubstringwithCenter(s, i, i);
            if(p.length() > longestStr.length())
                longestStr = p;

            String q = findmaxsubstringwithCenter(s, i, i+1);
            if(q.length() > longestStr.length())
                longestStr = q;
        }
        return longestStr;
    }
    private static String findmaxsubstringwithCenter(String s,int l,int r){
        while(l >= 0 && r < s.length() && s.charAt(l) - s.charAt(r) == 0){
            l--;
            r++;
        }
        return s.substring(l+1 ,r);
    }

    //
}
