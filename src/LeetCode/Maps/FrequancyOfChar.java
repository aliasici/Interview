package LeetCode.Maps;

import java.util.*;

public class FrequancyOfChar {
    public static void main(String[] args) {
        String str = "aaabbbccb"; // a3b4c2
        int [] arr = {1,2,4,5,6,6,6,6,6};
        Map<String, Integer> map = new LinkedHashMap<>(); // {a=3, b=4, c=2}


        List<String> list =  Arrays.asList( str.split("") );

        for(String each : list){ // each: a, a, a, b, b, b, c, c, b
            map.put( each, Collections.frequency(list, each));
        }

        System.out.println(map);

    }

}

/*
1. Write a program that stores the the character and frequency of each character from a String in to a Map
	    Ex:
	    	str = "aaabbbccb"
		    output:
		        {a=3, b=4, c=2}
 */

