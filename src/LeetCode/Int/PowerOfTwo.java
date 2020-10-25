package LeetCode.Int;

public class PowerOfTwo {
    // given integer write a function to determine if it is a power of two
    public static void main(String[] args) {
        // basicly we fint out 0, 2, 4, 8, 16, 32

        System.out.println(isPowerOfTwo(256));
        System.out.println(Math.pow(2,8));

    }
    public static boolean isPowerOfTwo(int n){

        for(int i=0;i<n;i++){
            if(Math.pow(2,i)>n)return false;
            else if(Math.pow(2,i)==n)return true;
        }
        return false;
    }



//    public static boolean isPowerOfTwo(int n){
//        long i = 1;
//
//        while (i < n){
//            i *= 2;
//        }
//        return i == n;
//
//    }

}
