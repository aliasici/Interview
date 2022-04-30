package southwest;

import java.util.*;

public class Star {


    public static void main(String[] args) {
        int count = 6;
        for (int i = 1; i <= count; i++) {
            for (int j = count; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}
//
//            int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4,};
//
//            List<Integer> list = Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
//
//            Map<Integer, Integer> number = new HashMap<>();

//            for (Integer each : list) {
//
//                int count = 0;
//
//                if (number.containsKey(each)) {
//                    number.put(each, number.get(each)+1);
//
//                }else {
//                    number.put(each,1);
//                }
//
//
//            }
//
//            System.out.println(number);
//        }
//
//    }



//            for (int each : number.keySet()) {
//                if (each == number.get(each)) {
//                    return index;
//                }
//            }
//
//            if (each == count) {
//
//                return bigNum;
//
//            }






