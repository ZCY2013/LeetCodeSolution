public class ReverseInt {
    public static void main(String[] args) {
        int x = -2147483647;
        System.out.println(ReverseInt.reverse(x));
    }

    /**
     * In case the parameter is a 32-bit integer,
     * so the first number of biggest x is smaller than 3
     * @param x 32-bit int
     * @return  int reverse x
     */
    public static int reverse(int x) {
        int sum = 0,temp;
        do{
            temp = x % 10;
            x = x / 10;
            if(Math.abs(sum) > Integer.MAX_VALUE / 10 )
                return 0;
            sum = sum * 10 + temp;
        }while(x != 0);

        return sum;
    }
}
