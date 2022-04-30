package southwest;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticOrder {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string value: ");

        String str = sc.nextLine();
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));

        int temp, size;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a string value: ");
//        String str2 = scan.nextLine();
        char ch[] = str.toCharArray();
        size = ch.length;
        for(int i = 0; i < size; i++ ) {
            for(int j = i+1; j < size; j++) {
                if(ch[i]>ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = (char) temp;
                }
            }

        }
        System.out.println("Alphabetic order is: "+Arrays.toString(charArray));
    }
}

