package southwest;

import java.util.Scanner;

public class VisaCard {
    /*
Coding: Easy
Given a string s, and two indices start, and end, print a substring consisting of all characters in the inclusive range from start to end-1. You'll find the String class' substring method helpful in completing this challenge.
Input Format
The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.
Constraints
1<=S<=100 0<=start<=end<=n String s consists of English alphabetic letters (i.e., [a-z, A-Z]) only.
Output Format
Print the substring in the inclusive range from start to end -1.
Sample Input
Helloworld
3 7
Sample Output
lowo
Explanation
In the diagram below, the substring is highlighted in green.


     */

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Input one word");
//
//        String word = input.nextLine();
//
//        String word2 = word.substring(3,7);
//
//        System.out.println(word2);

        /*
        Print numbers from 1 to 100 without using any numbers
         */

        int a = 'y' / 'y';
        String b = "1234567890";

        int z = b.length() * b.length(); // 100

        while (a <= z) {

            System.out.print(" " + a);
            a++;
        }

    }


}
