package hamzayilmaz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NonDuplicate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String first =  scan.nextLine();

        int num = first.length();

        System.out.println(num);

        String word = "";

        Set<Character> list = new HashSet<>();
        for (int i = 0; i < num; i++){
            list.add(first.charAt(i));

        }
        System.out.println(list);



        for (int i = 0; i <num ; i++ ){
            String newWord = String.valueOf(first.charAt(i));
            if (!word.contains(newWord)){
                word += newWord;
            }

        }
        System.out.println(word);

    }
}
