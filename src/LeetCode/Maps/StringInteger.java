package LeetCode.Maps;

import java.util.HashMap;
import java.util.Map;

public class StringInteger {

    public static void main(String[] args) {

        String [] words = {"aa", "bbbb"};

        System.out.println(mapStringInt(words));

    }

    public static Map<String,Integer> mapStringInt(String[] arr){


        Map<String, Integer> map = new HashMap<>();

        for (String each : arr){
            map.put(each, each.length());
        }
        return map;
    }


}
