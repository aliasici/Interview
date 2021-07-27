package hamzayilmaz;

import java.util.Scanner;

public class NonDuplicate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String first =  scan.nextLine();

        int num = first.length();

        System.out.println(num);

        String word = "";


        for (int i = 0; i <num ; i++ ){
            String newWord = String.valueOf(first.charAt(i));
            if (!word.contains(newWord)){
                word += newWord;
            }

        }
        System.out.println(word);

    }
}
