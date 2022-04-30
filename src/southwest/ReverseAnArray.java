package southwest;

import LeetCode.String.RemoveValue.nums;
import sun.security.krb5.internal.crypto.Aes128;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        System.out.println("array before reverse: " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("array after reverse: " + Arrays.toString(array));

        int i = 0;
        int j = array.length - 1;
        int[] reverseArr = new int[array.length];

        while (i < array.length) {
            // assign element
            reverseArr[i] = array[j];

            // update iterator variables
            i++; // increase i
            j--; // decrease j
        }

        System.out.println("array after reverse: " + Arrays.toString(array));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        int[] arr = {1, 2, 3,4,5,6};

        int[] result = new int[arr.length];
        int k = 0;
        while( k < arr.length ) {
            result[arr.length-1-k] = arr[k];
            k++;
        }
        System.out.println("array after reverse: " + Arrays.toString(result));
    }


}
