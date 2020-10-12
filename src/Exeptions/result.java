package Exeptions;

public class result {
    public static void main(String[] args) {
        // We have to exceptions child through parent
       // Means first we have to use child exceptions....OTHERWISE we got exception error
        // Imagine that IF WE HAVE HANDLED ISSUE WE GOT ERROR AGAIN

        try{
            System.out.println("hi bye");

        }catch (Exception e){
            System.out.println("e");
//        }catch (ArithmeticException e){
//            System.out.println("e");
        }finally {
            System.out.println("!");
        }
    }
}
