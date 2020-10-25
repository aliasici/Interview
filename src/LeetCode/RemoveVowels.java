package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        System.out.println(vowel("aaabjh"));


    }
    public static String vowel(String s){
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();


    }
}
