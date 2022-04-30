package terawe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesOfChar {
    public static void main(String[] args) {

        String  str = "ali ne olur interviewe gec";

        printDuplicates(str);

    }

    public static void printDuplicates(String str){

        if(str.isEmpty()){
            System.out.println("Is empty");
            return;
        }else if(str == null){
            System.out.println("is Null");
            return;

        }else{
            if(str.length() == 1){
                System.out.println("It is single char");
                return;
            }
        }

        char[] array = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (Character each : array){
            if (map.containsKey(each)){
                map.put(each, map.get(each)+1);
            }else{
                map.put(each, 1);
            }
        }

        Set<Map.Entry<Character,Integer>> entryset = map.entrySet();

        for (Map.Entry<Character,Integer> entry : entryset){
            if (entry.getValue() > 1 ){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        }
    }
}
