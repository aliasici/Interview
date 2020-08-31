package JavaInterview;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "AABBBC";
        String uniques = "";

        ArrayList<String> list = new ArrayList<>();

        for(String each : str.split("")){
            list.add(each);
        }
        String nonDup = "";

        for(String each : list){
            int count= Collections.frequency(list,each);
            if(count == 1){
                nonDup += each;
            }
        }
        System.out.println(nonDup);


    }
}
