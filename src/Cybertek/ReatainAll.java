package Cybertek;

import java.util.ArrayList;
import java.util.Arrays;

public class ReatainAll {
    public static void main(String[] args) {

        ArrayList<String > str1 = new ArrayList<>();
        str1.addAll(Arrays.asList("ak","pak","tak"));

        ArrayList<String > str2 = new ArrayList<>();
        str2.addAll(Arrays.asList("ak","sak"));

        str1.retainAll(str2);

        System.out.println(str1);
    }
}
