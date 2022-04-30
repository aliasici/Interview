package southwest;

import LeetCode.String.RemoveValue.nums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {
    /*
   Given an array, rotate the array to the right by k steps,
   where k is non-negative.
   Example 1:
   Input: nums = [1,2,3,4,5,6,7], k = 3
   Output: [5,6,7,1,2,3,4]
        */
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("+++++++++++++++++++++++");
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8};
        leftRotate(nums2, 5);

        System.out.println("+++++++++++++++++++++++");

        // Approach #2 RIGHT ROTATION
        Integer[] arr = {0, 1, 2, 3, 4};
        Collections.rotate(Arrays.asList(arr), 2);
        System.out.println(Arrays.toString(arr)); //[3, 4, 0, 1, 2]
        System.out.println("+++++++++++++++++++++++++++++++");

        List<Integer> list2 = Arrays.asList(0, 1, 2, 3, 4,5,6,7,8);
        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("+++++++++++++++++++++++++++++++");

        //Approach #3 LEFT ROTATION
        int[] a = {1, 2, 3, 4, 5, 6};

        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());

        Collections.rotate(list, 3);
        System.out.println(list);//[4, 5, 6, 1, 2, 3]

        System.out.println("+++++++++++++++++++++++++++++++");

        // Right Rotation
        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8};
        rightRotate(nums3,2);


    }

    public static void leftRotate(int[] inputArray, int n) {
        System.out.println("Input Array Before Rotation :");
        System.out.println(Arrays.toString(inputArray));

        int temp;
        for (int i = 0; i < n; i++) {
            temp = inputArray[0];

            for (int j = 0; j < inputArray.length - 1; j++) {
                inputArray[j] = inputArray[j + 1];
            }

            inputArray[inputArray.length - 1] = temp;
        }

        System.out.println("Input Array After Left Rotation By " + n + " Positions :");

        System.out.println(Arrays.toString(inputArray));
    }

    private static void rightRotate(int[] inputArray, int n) {

        System.out.println("Input Array Before Rotation :");

        System.out.println(Arrays.toString(inputArray));

        int temp;

        for (int i = 1; i <= n; i++) {
            temp = inputArray[inputArray.length-1];

            for (int j = inputArray.length-1; j > 0; j--)
            {
                inputArray[j] = inputArray[j-1];
            }

            inputArray[0] = temp;
        }

        System.out.println("Input Array After Right Rotation By "+n+" Positions :");

        System.out.println(Arrays.toString(inputArray));
    }

}
