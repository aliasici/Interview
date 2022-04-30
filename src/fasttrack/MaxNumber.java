package fasttrack;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int max = number;

        while (number != 0) {
            number = input.nextInt();


            if (number > max) {
                max = number;
            }
            System.out.println("Max number value: " + max);

        }
    }
}
