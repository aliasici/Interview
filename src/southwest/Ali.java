package southwest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ali {
    /*
    Given 2 arrays. They are consist of non empty strings.
    Write a program to find out all elements appear in first
    array but not in second array.

    Sample input:

    Array A: ["one", "two", "four", "ten"]

    Array B: ["one", "four", "seven", "six"]

  Sample output:

    In A not in B: ["two", "ten"]
     */

    public static void main(String[] args) {
        String[] A= {"one", "two", "four", "ten","eleven", "six"}; // fixed size , 5

        String[] C = {"one", "two", "four", "ten", "eleven"};

     //   String[] C = new String[12];

        String[] B ={ "one", "four", "seven", "six"}; //4

        int[] num1 = {1,2,3,4,5};

        int[] num2 = {2,3,6,7,8};

        char[] ch1 ={'A','B'};
        char[]  ch2= {'B','D'};

        


        List<String> list1 = new LinkedList<>(Arrays.asList(A));

        List<String> list2 = new LinkedList<>(Arrays.asList(B));

       // List<String> list = new LinkedList<>();


        for (String each : A){

            for (String e :B){
                if(each.equals(e)){
                    list1.remove(each);
                }
            }
        }

        System.out.println(list1);





    }
}
