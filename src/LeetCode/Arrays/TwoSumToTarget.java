package LeetCode.Arrays;

import java.util.Arrays;

public class TwoSumToTarget {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};

        System.out.println(Arrays.toString(twoSum(arr,4)));

    }
    public static int[] twoSum(int[] numbers, int target){

        int pointer1 = 0;
        int pointer2 = numbers.length -1;

        while(pointer1 <= pointer2){
            int sum = numbers[pointer1] + numbers[pointer2];

            if(sum > target){
                pointer2 -=1;
            }else if(sum < target){
                pointer1 +=1;
            }else {
                return new int[] {pointer1 +1,pointer2 +1};
            }
        }
        return new int[] {pointer1+1, pointer2+1};
    }
}
