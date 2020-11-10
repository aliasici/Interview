package LeetCode.Arrays;

import java.util.Arrays;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,1};
        System.out.println(containsDup(arr));

    }
    public static boolean containsDup(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
