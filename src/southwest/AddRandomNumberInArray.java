package southwest;

import java.util.Arrays;

public class AddRandomNumberInArray {

    public static void main(String[] args) {

        int[] counts = new int[10];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = (int) (Math.random() * 10);
        }

        System.out.println("Random numbers = "+Arrays.toString(counts));

        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 5);
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
