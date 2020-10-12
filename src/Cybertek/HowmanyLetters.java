package Cybertek;

import java.util.Scanner;

public class HowmanyLetters {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter a word");
        String str = input.nextLine();
        for(int i = 0; i <= str.length()-1; ){
            int count = 0;
            String a = str.substring(i,i+1);
            for(int j = 0; j <= str.length()-1; j++){
                if(str.substring(j, j+1).equals(a)){
                    count ++;
                }
            }
            str = str.replaceAll(a,"");
            System.out.println(a+count);
        }
    }
}

