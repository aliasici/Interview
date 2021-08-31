package Cybertek;

public class ReverseString {

    public static void main(String[] args) {

        String word = "alis";

        System.out.println(reverse(word));

        System.out.println(reverse2(word));

    }

    public static String reverse(String str){

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){

            reverse += str.charAt(i);
        }

        return reverse;

    }
    public  static String  reverse2(String str) {

        return new StringBuffer(str).reverse().toString();

    }
}
