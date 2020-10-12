package Cybertek;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversedArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i)+" ");

        }
    }
}
