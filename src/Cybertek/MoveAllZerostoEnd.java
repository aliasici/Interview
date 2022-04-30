package Cybertek;

import LeetCode.String.RemoveValue.nums;

import java.util.Arrays;

public class MoveAllZerostoEnd {

     /*
    write a program that can move all the zeros to the end of an array
     */

    public static void main(String[] args) {
        int[] array = {1, 0, 2, 0, 3, 5, 0, 7, 0};

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }
        for (int i = count; i < array.length ; i++) {
            result[i] = 0;

        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(result));

    }

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }
        return result;

    }
    }


