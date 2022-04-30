package southwest;

public class StaticInstance {

    String str = "Ali";
    String id = "76";
    public static void main(String[] args) {

        StaticInstance obj = new StaticInstance();

        obj.str = "ali";

    //    System.out.println(str); // Complier ERROR

     //   System.out.println(id);  // Complier ERROR



    }
}
