package southwest;

import java.util.*;

public class SortMap {
    public static void main(String[] args) {

        // Write a method that can sort the Map by values

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Python", 15);

        System.out.println("sortByValue(map) = " + sortByValue(map));
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
//
//        List<String> list = new ArrayList<String>(map.keySet());
//        List<Integer> list1 = new ArrayList<Integer>(map.values());

        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap();

        for (Map.Entry<String, Integer> each : list) {

            map.put(each.getKey(), each.getValue());

        }

        return map;

    }
}
