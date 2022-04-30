package terawe;

import java.util.Arrays;

public class LargestNumberInArray {

    public static void main(String[] args) {

        int[] array = {1,4,5,66,7,88,9,11};
        System.out.println(maxNumber(array));
        System.out.println(maxNum(array));

        // 3rd approach
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Largest in given array is " +max);

    }
    public static int maxNumber(int[] arr){

        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]> max){
                max =arr[i];
            }
        }
        return max;
    }

    //second approach

    public static int maxNum(int[] arr){

        Arrays.sort(arr);

        int max = arr[arr.length-1];

        return max;
    }
}
