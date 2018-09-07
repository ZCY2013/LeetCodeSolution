public class isPalindrome {
    public static void main(String[] args) {
        int x = 213;
        System.out.println(isPalindrome.realize(x));
    }

    private static boolean realize(int x){
        int temp = 0;
        if(x < 0 || (x % 10 ==0) && x != 0) return false;
        while(temp < x / 10)
        {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }
        if(x == temp || x / 10 == temp ) return true;
        return false;
    }
}
