package terawe;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,9,7};
        int n = array.length;

        reverse(array,n);
        System.out.println("++++++++++++++++");
        sortingArray(array,n);

    }
    public static void reverse(int[] arr, int n) {

        int[] result = new int[n]; // DECLARE NEW ARRAY THAT HAS THE SAME LENGTH OF THE GIVEN ARRAY
        int k = 0;

        for (int i = n - 1; i >= 0; i--) {
            result[k] = arr[i];
            k++;
        }

        System.out.println(Arrays.toString(result));

        }

        public static void sortingArray(int[] a, int k){

        for (int i =0; i < a.length-1; i++){
            if (a[i] >  a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] =temp;
            }
        }
            System.out.println(Arrays.toString(a));

        }
    }
