package ArrayList;

import LeetCode.String.RemoveValue.nums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayList {
    /*
    ArrayList -- sorting in descending order
    Write a method that can sort the ArrayList in descending order
    without using the sort method
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,99,55,45,88,77,22,11));

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }



        }

        System.out.println(list);



    }
}
