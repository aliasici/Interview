package southwest;

import java.util.*;

public class ConsecutiveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4,5,6,6,7,8,8,9,8};

      //  Arrays<Integer> list = new  Arrays.asList(arr);

        List<Integer> input= Arrays.asList(1,1,1,2,2,3,3,3,4,5,5,5,5,5);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> list = Arrays.asList(1,1,1,2,2,3,3,3,4,5,5,5,5,5);

        System.out.println(list);

        noConsecutiveDups((ArrayList<Integer>) list);

        // Always add first value
     //   newList.add(input.get(0));

//        for (int i=1; i< arr.length; i++) {
//            if (arr[i-1] == arr[i]) {
//                input.remove(arr[i]);
//            }
//        }
//
//        for(int i = 0; i < arr.length; i++ ) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    input.remove(i);
//               //     input.remove(arr[j]);
//
//                }
//            }
//        }
//        System.out.println(input);

//
//        // Iterate the remaining values
//        for(int i = 1; i < input.size(); i++) {
//            // Compare current value to previous
//            if(input.get(i-1) != input.get(i)) {
//                input.add(input.get(i));
//            }
//        }
//
//        System.out.println(Arrays.asList(input));

    }
    public static ArrayList<Integer> noConsecutiveDups(ArrayList<Integer> input) {

        ArrayList<Integer> newList = new ArrayList<Integer>();

        // Always add first value
        newList.add(input.get(0));

        // Iterate the remaining values
        for(int i = 1; i < input.size(); i++) {
            // Compare current value to previous
            if(input.get(i-1) != input.get(i)) {
                newList.add(input.get(i));
            }
        }

        return newList;
    }

    }

