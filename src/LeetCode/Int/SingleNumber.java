package LeetCode.Int;

import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,4,2,8,2};
        System.out.println(singleNumber(arr));

    }
    public static int singleNumber(int[] numbers){
        HashSet<Integer> set = new HashSet<Integer>();

        for(int each : numbers){
            if (set.contains(each)) {
                set.remove(each);
            }else {
                set.add(each);
            }
        }
        for (int each : set){
            return each;
        }
        return -1;

    }
}
