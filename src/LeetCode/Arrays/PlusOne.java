package LeetCode.Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
//        int[] arr = {9,9,9,9,9};
//        System.out.println(Arrays.toString(plusOne(arr)));
        int[] arr2 = {2,3,4};
        int[] arr3 = new int[arr2.length +1];
        arr3[0] = 1;
        System.out.println(Arrays.toString(arr3));

    }
    public static int[] plusOne(int[] digits){
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length +1];
        result[0] = 1;
        return result;

    }
}
