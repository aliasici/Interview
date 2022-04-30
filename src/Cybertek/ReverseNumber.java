package Cybertek;

public class ReverseNumber {
    static int num = 20;
    //int num = 40;

    static {

        num = 60;
        num =100;
    }


    public static void main(String[] args) {
        int x =452;
        System.out.println(reverse(452));
        System.out.println(num);

        String str = "alim";
        reverse(str);

    }

    public static int reverse(int x) {

        int reversed = 0;

        while(x != 0) {
            int digit = x % 10; // 2, 5, 4
            reversed = reversed * 10 + digit; //2 , 25, 254
            x /= 10;
        }

        return reversed;
    }

    public static void reverse(String str) {

        int low = 0;
        int last = str.length() - 1;
        boolean isMatch = true;

        for (int i = low; i < str.length(); i++) {
            if (str.charAt(low) != str.charAt(last)) {
                isMatch = false;
                System.out.println("This is not palindrome");
                break;
            }
            low++;
            last--;
        }
        if (isMatch) {
            System.out.println("This is palindrome");
        }
    }


}
