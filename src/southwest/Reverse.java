package southwest;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put a sentence");
        String sentence = input.nextLine();
      //  String sentence = "Go work";
        String reversed = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversed);

        String str = sentence.substring(1) + sentence.charAt(0);
        System.out.println("str = " + str);
    }

    public static String reverse(String sentence) {
        if (sentence.isEmpty())
            return sentence;

        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
}