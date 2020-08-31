package JavaInterview;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "AABBBC";
        String uniques = "";
        String nonDup = "";

        ArrayList<String> list = new ArrayList<>();

        for(String each : str.split("")){
            list.add(each);
            if(!nonDup.contains(each)){
                nonDup += each;
            }
        }
        System.out.println(nonDup);

        for(int i = 0; i <=nonDup.length()-1; i++) {
            int count =0;

            for(int j = 0; j <= str.length()-1; j++){
                if(str.charAt(j) == (nonDup.charAt(i))){
                    count ++;

                }

            }
            uniques += nonDup.charAt(i)+ ""+count;

        }
        System.out.println(uniques);





    }
}
