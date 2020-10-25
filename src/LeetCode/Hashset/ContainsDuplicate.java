package LeetCode.Hashset;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(contains(arr));

    }

    public static boolean contains(int[] nums) {

        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }

        return false;
    }


}