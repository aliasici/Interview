package LeetCode.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        System.out.println(contains(arr));
        System.out.println(contDup(arr));

    }
    public static boolean contains(int[] numbers){
        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length -1; i++){
            if(numbers[i] == numbers[i+1]){
                return true;
            }
        }
        return false;
    }
    public static boolean contDup(int[] arr){
        HashSet<Integer> numbers = new HashSet<>();

        for(int i = 0; i < arr.length-1; i++){
            if(numbers.contains(arr[i]))
                return true;
                numbers.add(arr[i]);
        }
        return false;
    }
}
