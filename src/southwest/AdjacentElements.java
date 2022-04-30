package southwest;

import LeetCode.String.RemoveValue.nums;

import java.util.Arrays;

public class AdjacentElements {

    public static void main(String[] args) {
        int[] arr ={2, 0, 0, 2, 3, 3,5, 0, 0, 1, 1,1};
        int[] arr2 ={8,9};
        System.out.println(Arrays.toString(removeUtil(new int[] {2,4,2, 0, 0, 2, 3, 3, 0, 0, 1, 1,5})));
        System.out.println(Arrays.toString(removeUtil(arr))); // 5 , 1
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(Arrays.toString(combineTwoArray(arr,arr2)));

    }
    public static int[] removeUtil(int[] arr) {
        int i=0;
        boolean check = false;

        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                check = true;
                break;
            }
        }

        if(check)
            return removeUtil(combineTwoArray(Arrays.copyOfRange(arr, 0, i), Arrays.copyOfRange(arr, i + 2, arr.length)));
        else
            return arr;

    }

    public static int[] combineTwoArray(int[] arr1, int[] arr2) {
        int[] newArr = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for (int j = 0; j < arr2.length; j++)
            newArr[arr1.length + j] = arr2[j];

        return newArr;
    }


}
