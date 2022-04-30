package southwest;

import java.util.Arrays;

public class Closest2Elements {

    public static void main(String[] args) {

        int[] arr1 = {35,42,97,2,13,45,56,83}; //3
     //   findDifference(arr1);
        findDifference(new int[] {5, 8, 4, 2, 9, 0});

        System.out.println("==========================");

//        findDifference(new int[] {45, -89, 12, -62, 31, -57});
//
//        System.out.println("==========================");
//
//        findDifference(new int[] {5, -3, 7, -2});

    }

    private static void findDifference(int[] inputArray) {

        int minimum = Integer.MAX_VALUE;

        int firstElement = inputArray[0];

        int secondElement = inputArray[1];

        for (int i = 0; i < inputArray.length-1; i++) {

            for (int j = i+1; j < inputArray.length; j++) {

                if(Math.abs(inputArray[i]-inputArray[j]) < minimum) {

                    minimum = Math.abs(inputArray[i]-inputArray[j]);

                    firstElement = inputArray[i];

                    secondElement = inputArray[j];
                }
            }
        }

        System.out.println("Input Array : "+Arrays.toString(inputArray));

        System.out.println("Minimum Absolute Difference : "+minimum);

        System.out.println("Pair Of Elements : ("+firstElement+", "+secondElement+")");
    }
    }

