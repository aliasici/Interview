package LeetCode.String.RemoveValue;

import java.util.Arrays;

public class RemoveValue {

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,3,6};
        int value = 3;

        System.out.println(removeValue(arr,value));


    }

      public static  int removeValue(int[] arr, int value) {

       int index = 0;
       for(int each : arr){
           if(each != value){
               arr[index++] = each;

           }
       }
        return index;
        }
    }
