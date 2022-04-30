package Cybertek;
 /*
 write a program that can return the sum of all the digits from a string
         ex:
         input: "a1b2c3"
         output: 6
         (1+2+3= 6)
         HINT: on ascii table, the characters between #48 ~ #57 are digits

 */
public class SumOfDigits {
     public static void main(String[] args) {
         String str = "a2b3c4";
         int sum = 0;
         int count = 0;

         for(int i = 0; i <= str.length()-1; i++){
             char each = str.charAt(i);
             if(each >= 48 && each <= 57){
                 sum += Integer.parseInt(""+each);
                 System.out.println(sum);
             }


         }
         System.out.println("+++++++++++++++");

         for(int i = 0; i <= str.length()-1; i++){
             char each = str.charAt(i);
             if(Character.isDigit(each)){
                 count += Integer.parseInt(""+each);
                 System.out.println(count);
             }

         }



     }

}
