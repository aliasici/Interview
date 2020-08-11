package JavaInterview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "bca";

        String a1 = "";
        String a2 = "";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (char each : ch1) {
            a1 += each;
        }
        for(char each : ch2){
            a2 += each;
        }
        System.out.println(a1.equals(a2));


    }

}
