package southwest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) {

        printNum(1);


        String str = "I love java my main language java I really love java";

        String[] str2 = str.split("[.,:;!?(){]");

        countWord(str);

        System.out.println("+++++++++++++++++++");

        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);


        String[] words = str.trim().split("\\s+"); // separate string around spaces

        System.out.println("count is = " + (words.length));

        System.out.println(Arrays.asList(str2));
    }
        public static void countWord(String word){

        String[] arr = word.split("\\s+"); // " " empty space de ayni seyi verir

            Map<String, Integer> map = new HashMap<>();

            for(String each : arr){
                if(!map.containsKey(each)){
                    map.put(each ,1);
                }else{
                    map.put(each, map.get(each)+1);
                }
            }
            for(Map.Entry<String, Integer> each : map.entrySet()){

                System.out.println(each.getKey()+" occures " + each.getValue() + " times");
            }

        }

        public static void printNum(int num){

            if(num <= 20){
                System.out.print(num+" ");
                num++;
                printNum(num);

            }
        }

}

