package southwest;

import java.util.*;

public class Uniques {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3,3,4, 4, 5, 6,6,6,88,77,88};

        Set<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6,6,88,77,88));

        System.out.println(set);

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        List<Integer> list = new ArrayList<Integer>();

        for(Integer each: arr) {
            if(!list.contains(each)) {
                list.add(each);
            }
        }
      //  list.toArray(new Object[0]);

        System.out.println(list);

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        List<Integer> numbers = new LinkedList<>();

        for(Integer each: arr) {
            if(!numbers.contains(each)) {
                numbers.add(each);
            }
        }
       // numbers.toArray(new Object[0]);

        System.out.println(numbers);


        System.out.println("++++++++++++++++++++++++++++++++++++++");

        String str = "KAYAK";
        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> word = Arrays.asList(str.split(""));


        for (String each : word) {
            if (Collections.frequency(word, each) == 1) {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
}
