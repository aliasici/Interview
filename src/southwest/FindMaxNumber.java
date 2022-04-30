package southwest;

import java.util.HashMap;
import java.util.Map;

public class FindMaxNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,4,4,5,5,5,5,5};
        System.out.println(findMax(nums));

    }
    public static int findMax(int[] numbers){
        Map<Integer,Integer> map = new HashMap<>();

      for (int each : numbers){
          if (map.containsKey(each)){
              map.put(each, map.get(each)+1);

          }else{
              map.put(each, 1);
          }
      }

      int answer = 0;
      for (int key : map.keySet()){
          if (key == map.get(key)){

              answer = Math.max(answer, key);
          }
      }
      return answer;
    }
}
