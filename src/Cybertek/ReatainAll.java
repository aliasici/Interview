package Cybertek;

import java.util.ArrayList;
import java.util.Arrays;

public class ReatainAll {
    /*
    The retainAll() method of ArrayList is used to remove
    all the array list’s elements that are not contained in the specified collection
     */
    public static void main(String[] args) {

        ArrayList<String > str1 = new ArrayList<>();
        str1.addAll(Arrays.asList("ak","pak","tak"));

        ArrayList<String > str2 = new ArrayList<>();
        str2.addAll(Arrays.asList("ak","sak"));

        str1.retainAll(str2);
        str2.retainAll(str1);

        System.out.println(str1); //ak is matching element
        System.out.println(str2);
    }
}
