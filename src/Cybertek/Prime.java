package Cybertek;

public class Prime {

        // What is a prime number:
        // a number that is only divisible by itself and 1

        public static void main(String[] args) {
            System.out.println(isPrimeNumber(5));
            System.out.println(isPrimeNumber(10));
            System.out.println(isPrimeNumber(11));
            System.out.println(isPrimeNumber(-13));

            System.out.println();
            printPrimeNumber(100);
        }

        public static boolean isPrimeNumber(int num) {

           // if(num < 0) return false;
            if(num < 2) return false;


            for(int i= 2; i < num; i++) {
                if(num % i == 0){
                    return false;
                }
            }

            return true;
        }

        // print out all prime numbers up to a number

        public static void printPrimeNumber(int number) {

            for(int i= 2; i < number; i++) {

                if(isPrimeNumber(i)) {
                    System.out.print(i + " ");
                }
            }

        }


}
