package terawe;

public class Fibonacci {
    public static void main(String[] args) {

        int a =0; int b= 1;
        int num = 10;

        for (int i =2 ; i < num; i++){
            System.out.print(" "+b);
             int temp = a +b;
             a =b;
             b = temp;

        }
    }
}
