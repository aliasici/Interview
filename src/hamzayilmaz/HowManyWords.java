package hamzayilmaz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HowManyWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first =  scan.nextLine();

       // int num = first.length();
        String[] word = first.split(" ");

       // System.out.println(num);
        System.out.println(Arrays.toString(word));

        HashMap<String, Integer> words = new HashMap<>();

        for (int i = 0; i < word.length; i++){

            if (words.containsKey(word[i])){
                int num = words.get(word[i]);
              words.put(word[i], num +1);
            }else {
                words.put(word[i],1);
            }
        }
        System.out.println(words);
    }
}
