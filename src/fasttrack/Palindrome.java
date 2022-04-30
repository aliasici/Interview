package fasttrack;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Enter a number or word: ");

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        int high = word.length() - 1;
        int low = 0;
        boolean isPalindrome = true;

        for (int i = 0; i < high / 2; i++) {
            if (word.charAt(i) != word.charAt(high)) {
                isPalindrome = false;
                System.out.println("This is not palindrome..");
                break;
            }
            high--;
            low++;
        }
        if (isPalindrome==true){
            System.out.println("This input is palindrome...");
        }
    }
}
