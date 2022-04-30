package southwest;

public class ReverseNumberRecursion {

    // this is a recursive method, in the recursive method, you need use a return statement
    // to not to get an error

    public static void main(String[] args) {
        reverse(9867);

    }

    private static void reverse(int num){

        if(num < 10){
            System.out.println(num);
            return;
        }else {
            System.out.print(num % 10);
            reverse(num / 10);
        }
    }
}

