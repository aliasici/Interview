package southwest;

import java.util.Random;

public class MergeSortArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i =0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.println("\nBefore");
        printArray(numbers);

        //SORTING ALGORITHM HERE
        boolean somethingSwapped = true;
        while (somethingSwapped){
            somethingSwapped = false;
            for (int i =0; i < numbers.length-1; i++){
                if (numbers[i] > numbers[i+1]){
                    somethingSwapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }

        System.out.println("\nAfter");
        printArray(numbers);

        mergeSort(numbers);
        System.out.println("\nAfter");
        printArray(numbers);
    }


    public static void printArray(int[] numbers){
        for (int i =0; i < numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
    }
    private static void mergeSort(int[] inputArray){
        int length = inputArray.length;
        if (length < 2){
            return;
        }
        int midIndex = inputArray.length / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[length - midIndex];

        for (int i= 0 ; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }

        for (int i= midIndex ; i < length; i++){
            rightHalf[i - midIndex] = inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray,leftHalf,rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i =0, j =0, k =0 ;

        while (i < leftSize && j < rightSize){
            if (leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }
}
