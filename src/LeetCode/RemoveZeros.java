package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveZeros {
    public static void main(String[] args) {
        int[] nums = {1,0,0,3,4,5};


        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] !=0){
                nums[index]= nums[i];
                index++;
            }

        }
        for (int i = index; i <nums.length ; i++) {
            nums[i] = 0;

        }
        System.out.println(Arrays.toString(nums));


    }
}
