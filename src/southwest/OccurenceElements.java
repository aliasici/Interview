package southwest;

import java.util.*;
import java.util.stream.Collectors;

public class OccurenceElements {
    /*
    Given an array “nums” of integers. Write a function which finds the biggest number X
    which occurs in array “nums” exactly X times and returns
    the index of the first occurrence X in array “nums”.
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5,6,6,6,6,6,6};
        List<Integer> list2 = new LinkedList<>();

        for (int i =0 ; i < arr.length; i++){
            list2.add(arr[i]);
        }
        System.out.println("list2 = " + list2); // [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5]

        List<Integer> list= Arrays.asList(1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5);


        List<Integer> most_Repetead = list.stream().filter(e ->
                Collections.frequency(list,e) == Collections.max(list)).collect(Collectors.toList());
        System.out.println(most_Repetead.get(0));


        List<Integer> repeated = list2.stream().filter(e ->
                Collections.frequency(list2,e) == Collections.max(list2)).collect(Collectors.toList());
        System.out.println(repeated.get(0));

    }
}

