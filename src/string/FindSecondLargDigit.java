package string;

import java.util.*;

public class FindSecondLargDigit {
    public static void main(String[] args) {
        String str1 = "A3B7C8D1A5";
        System.out.println(findDigit(str1));

    }

    public static int findDigit(String str){

        Set<Integer> set = new HashSet<>(); // ACCEPT ONLY UNIQUE

        for (int i =0; i < str.length(); i++){
            char ch = str.charAt(i);  // String i char yaptik

            if(Character.isDigit(ch)){
                set.add(Character.getNumericValue(ch)); // set e store ettim
            }
        }

        List<Integer> list = new ArrayList<>(set);  // List e attim

        Collections.sort(list); // sort yaptim kucukten buyuge dizdim

        if(list.size() < 2){
            return -1;
        }
        return list.get(list.size()-1);
    }
}
