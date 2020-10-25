package LeetCode.Hashset;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate_2 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        System.out.println(contains(arr));


    }
    public static boolean contains(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i]) return true;

        }

        return false;
    }
}
