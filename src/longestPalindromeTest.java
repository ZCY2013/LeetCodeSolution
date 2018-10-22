import java.sql.SQLOutput;

public class longestPalindromeTest {
    public static void main(String[] args) {
//        String str = "acbcaabaacbcd";
        String str = "cbbd";
        String result = longestPalindrome(str);
        System.out.println(result);
        longestPalindromeTest l = new longestPalindromeTest();
        System.out.println(l.manacher(str));
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

    //manacher's algorithm
    public String manacher(String str){
        int length = str.length();
        if(length == 0 ) return str;
        StringBuffer sb = new StringBuffer();
        sb.append("$#");
        for(int i = 0; i < length; i++)
        {
            sb.append(str.charAt(i) + "#");
        }
        sb.append("@");
        String s = sb.toString();
        int id = 0, maxlength=-1;
        int[] p = new int[s.length()];
        p[0] = 0;
        for(int i = 1; i< s.length(); i++)
        {
            if(maxlength > i) p[i] = Math.min(maxlength - i, p[2*id - i]);
            while( i + p[i] < s.length() && i - p[i] >= 0 && s.charAt(i-p[i]) ==  s.charAt(i+p[i]))
                p[i]++;
            if(maxlength < i + p[i]) {
                maxlength = i + p[i];
                id = i;
            }

        }
        int max = 0;
        for(int i = 0; i < p.length; i++)
        {
            if(p[i] > max) max = i;
        }
        return  str.substring((max-p[max]+1)/2,(max-p[max]+1)/2 + p[max] -2);
    }
}
