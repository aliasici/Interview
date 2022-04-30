package southwest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceChar {

    public static void main(String[] args) {
//        String str = "aliii";
//        getChars(str);

        System.out.println("Enter a sentence or word");

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        getChars(word);

    }

    public static void getChars(String name){

        char[] letters =name.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char each : letters){
            if(map.containsKey(each)){
                map.put(each,map.get(each) +1);
            }else{
                map.put(each,1);
            }
        }
        System.out.println(name + " : " + map);
        System.out.println(map);

    }
}
