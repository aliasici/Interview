package JavaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques2 {
    public static void main(String[] args) {
        String str = "AAABBCBBDDEE";
        String result = "";

        ArrayList<String> list = new ArrayList<>();
 //       list.addAll(Arrays.asList(str.split("")));

        for(String each : str.split("")){
            list.add(each);
        }
        System.out.println(list);

        for(String each : list){
            int count = Collections.frequency(list,each);
            if(count ==1){
                result += each;
            }
        }
        System.out.println(result);



    }
}
