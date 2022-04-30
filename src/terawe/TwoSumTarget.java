package terawe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {

    public static void main(String[] args) {

        int[] arr = {1,3,5,4,8};
        findTarget(arr,8);

    }
    public static void findTarget(int[] arr, int target){

        int[] array = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i < arr.length; i++){

            int difference = target - arr[i];

            if(map.containsKey(difference)){
                array[0] =i;
                array[1] = map.get(difference);

            }else
            map.put(arr[i],i );
        }

        System.out.println(Arrays.toString(array));
    }
}
