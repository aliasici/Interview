package southwest;

public class RecursionMethod {

    public static void main(String[] args) {
        sayHi(12);

    }

    private static void sayHi(int count){
        System.out.println("Hi");
        if (count <= 1){
            return;
        }
        sayHi(count-1);
    }
}
