package southwest;

import java.util.HashMap;

public class OcurrenceElement2{

    public static void main(String[] args) {

        int [] arr = {1,2,3,3,3,4,5,5,5,5,5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
         //   count.put(num, count.getOrDefault(num,0)+1);

        }

       // System.out.println(count);

        System.out.println(map);
        
        int answer = 0;
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                answer = Math.max(answer, key);
            }
        }
        System.out.println(answer);

    }



}

