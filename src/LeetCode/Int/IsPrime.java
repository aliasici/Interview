package LeetCode.Int;

public class IsPrime {
    public static void main(String[] args) {

        System.out.println(countPrimes(20));

    }
    public static int countPrimes(int n){
        boolean[] prime = new boolean[n];

        for(int i =2; i * i < prime.length; i++){
            if(prime[i]){
                for (int j = 2; j * i < prime.length; j++) {
                    prime[i * j] = false;

                }
            }
        }
        int countPrime = 0;
        for(int i = 2; i < prime.length; i++){
            if(prime[i]){
                countPrime++;
            }
        }
        return countPrime;

    }
}
