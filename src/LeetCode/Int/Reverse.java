package LeetCode.Int;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(-24));

    }
    public static int reverse(int number){
        boolean negative = false;
        if(number < 0){
            negative = true;
            number *= -1;
        }
        long reversed = 0;
        while (number > 0){
            reversed = (reversed * 10) +(number % 10);
            number /= 10;
        }
        if(reversed > Integer.MAX_VALUE){
            return 0;
        }
        return negative ? (int)(-1 * reversed) : (int) reversed;
    }
}
