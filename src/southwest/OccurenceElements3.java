package southwest;

import java.util.*;

public class OccurenceElements3 {
     /*
    Given an array “nums” of integers. Write a function which finds the biggest number X
    which occurs in array “nums” exactly X times and returns
    the index of the first occurrence X in array “nums”.
     */

    public static void main(String[] args) {

      //  int[] arr = {1,2,3,3,3,4,4,4,5,5,5,5,5};

        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> list = Arrays.asList(1,1,1,2,2,3,3,3,4,5,5,5,5,5);

        for (Integer each : list) {
            int frequency = Collections.frequency(list,each);
            map.put(each,frequency);

        }
        System.out.println(map); //{1=3, 2=2, 3=3, 4=1, 5=5}

        int answer = 0;
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                answer = Math.max(answer, key);
            }
        }
        System.out.println(answer);


    }

}
