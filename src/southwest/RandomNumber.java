package southwest;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        int[] arr2 = {1,2,3,4,5,6,78,8,9,0,88,99};
        int[] new_array = Arrays.copyOfRange(arr2, 3, 9); // output ===>  4,5,6,78,8,9

        for (int num : new_array){
            System.out.print(num + " ");
        }

        System.out.println("\n+++++++++++++++++++++++++++++");

        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("\nBefore");
        printArray(numbers);


        //SORTING ALGORITHM HERE

        boolean somethingSwapped = true;

        while (somethingSwapped) {
            somethingSwapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    somethingSwapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter");
        printArray(numbers);

    }


    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }

    }
}
