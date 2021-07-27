package hamzayilmaz;

import java.util.HashSet;
import java.util.Set;

public class TheSameArray {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,1,2};
        int[] array2 ={1,2,3};

        boolean arrays = theSame(array1,array2);
        System.out.println(arrays);
    }

    private static boolean theSame(int[] array1, int[] array2) {

        Set<Integer> array1Elements = new HashSet<>(); // Set contains only unique
        Set<Integer> array2Elements = new HashSet<>();

        for (int i =0; i < array1.length; i++){
            array1Elements.add(array1[i]);
        }
        for (int i =0; i < array2.length; i++){
            array2Elements.add(array2[i]);
        }
        if (array1Elements.size() != array2Elements.size()){
            return false;
        }
        for (Integer each: array1Elements) {
            if (!array2Elements.contains(each)) {
                return false;

            }
            
        }
        return true;
    }
}
