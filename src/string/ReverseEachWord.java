package string;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {

        reversedEachWord("ali veli kulaklari kupeli");
    }

    public static void reversedEachWord(String sentence){

        Scanner input = new Scanner(System.in);
        System.out.println("Write any sentence");
       // input.nextLine();

        String[] words = input.nextLine().split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            String newSen = words[i];
            String reversed = "";

            for (int j = newSen.length() -1; j >= 0; j--){
                reversed = reversed + newSen.charAt(j);
            }
            result  = result + reversed + " ";
        }
        System.out.println(result);

    }
}
