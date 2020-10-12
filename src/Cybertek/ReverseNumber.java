package Cybertek;

public class ReverseNumber {


    public static void main(String[] args) {
        int x =452;
        System.out.println(reverse(452));

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


}
