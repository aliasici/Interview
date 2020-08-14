package JavaInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class Uniques {
    public static void main(String[] args) {
        String str = "AAADBBC";
        String[] arr = str.split("");
        String nonDup = "";

        for(int i = 0; i <= arr.length-1; i++){
            int count = 0;
            for(int j = 0; j <= arr.length-1; j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }
            if(count == 1){
                nonDup += arr[i];
            }
        }
        System.out.println(nonDup);
    }


}
