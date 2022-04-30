package terawe;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 678; // 21

        System.out.println(sum(number));
    }

    public static int sum(int num){

        int sum = 0;

        while(num >0){
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
