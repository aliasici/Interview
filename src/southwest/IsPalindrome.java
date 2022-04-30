package southwest;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        String str1 = "KAYAK";
        System.out.println(isPalindrome(str1));

        // this is a solution for the Palindrome using while loop
        System.out.println("Enter a number or a word: ");

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int high = str.length() - 1;
        int low = 0;
        boolean isPalindrome = true;

        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                isPalindrome = false;
                System.out.println("This is not a palindrome....");
                break;
            }
            low++;
            high--;
        }

        if (isPalindrome) {
            System.out.println("The input is a palindrome... ");
        }
    }

    public static boolean isPalindrome(String str) {
        if(str == null)
            return false;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str); }
}
