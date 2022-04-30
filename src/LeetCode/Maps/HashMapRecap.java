package LeetCode.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapRecap {
    /*
    HashMap is CLASS
    MAP is INTERFACE
    in hashmap  NO ORDER NO INDEXING
                STORES VALUE (KEY, VALUE) FORMAT
                KEY CAN NOT BE DUPLICATED
                CAN STORE N NUMBER OF NULL VALUES BUT ONLY ONE NULL KEY
                HASHMAP IS NOT THREAD-SAFE, UNSYNCRONIZED

   */

    public static void main(String[] args) {
        HashMap<String, String> capitalMap = new HashMap<>();

        capitalMap.put("USA", "DC");
        capitalMap.put("TURKEY", "ANKARA");
        capitalMap.put("INDIA", "DELHI");
        capitalMap.put("USA", "LA");

        System.out.println(capitalMap.get("USA")); // LA


        //iterator over the keys: by using keySet()

        Iterator<String> it = capitalMap.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("key: "+key+" "+ "value: "+ value);
        }

        System.out.println("++++++++++++++++++++++");
        //iterator over the set(pai): by using entrySet()
        Iterator<Map.Entry<String,String>> it1 =  capitalMap.entrySet().iterator();
        while (it1.hasNext()){
            Map.Entry<String,String> entry = it1.next();
            System.out.println("key: "+entry.getKey()+" "+ "value: "+ entry.getValue());
        }

        System.out.println("++++++++++++++++++++++");
        //iterate hashmap using by for each and lambda expression
        capitalMap.forEach((p,a) ->System.out.println("key: "+ p+ " "+ " value: "+ a));
    }



}
