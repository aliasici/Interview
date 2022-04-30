package hamzayilmaz;

public class Factorial {

    public static void main(String[] args) {

        int factorial= 1;

        int num = 6;

        for (int i = 1; i <=num ; i++){
            factorial  =i *  factorial;
        }

        System.out.println(factorial);

    }
}
