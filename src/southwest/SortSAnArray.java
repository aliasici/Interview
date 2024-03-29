package southwest;

import java.util.Arrays;

public class SortSAnArray {
    public static void main(String[] args) {
        //define original array
        int [] intArray = new int [] {52,45,32,64,12,87,78,98,23,7};
        int temp = 0;

        //print original array
        System.out.print("\nOriginal array: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        //Sort the array in ascending order using two for loops
//        for (int i = 0; i <intArray.length; i++) {
//            for (int j = i+1; j <intArray.length; j++) {
//                if(intArray[i] >intArray[j]) {      //swap elements if not in order
//                    temp = intArray[i];
//                    intArray[i] = intArray[j];
//                    intArray[j] = temp;
//                }
//            }
//        }
        //SORTING ALGORITHM HERE
        boolean somethingSwapped = true;
        while (somethingSwapped){
            somethingSwapped = false;
            for (int i =0; i < intArray.length-1; i++){
                if (intArray[i] > intArray[i+1]){
                    somethingSwapped = true;
                    int tempA = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = tempA;
                }
            }
        }
        //print sorted array
        System.out.println("");

        System.out.println("AHA AHA SORTED ARRAY IS: "+Arrays.toString(intArray));

        System.out.println("\nArray sorted in ascending order: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

    }
}
