package JavaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Uniques3 {
    public static void main(String[] args) {
        // DO NOT USE NESTED LOOP
        String str = "AABBCDDEF";

        String uniques = "";

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));

//        for(String each : str.split("")){
//            list.add(each);
//        }
//        System.out.println(list);

        for(String each: list){
            int count= Collections.frequency(list,each);
            if(count == 1){
                uniques += each;

            }
        }
        System.out.println(uniques);




    }
}
