package LeetCode.Arrays;

public class MostRecurring {

    public static void main(String[] args) {

        int[] array1 = {23,234,232,232,321,121,23,234,23};
        int count= 0;
        int counter=0;
        int mostRecurringNumber=0;
        for (int i = 0; i < array1.length; i++) {
            counter=0;
            for (int j = 0; j <array1.length ; j++) {

                if (array1[i]==array1[j]){
                    counter++;
                }
            }
            if(counter>count){
                count=counter;
                mostRecurringNumber=array1[i];
            }
        }
        System.out.println(mostRecurringNumber+" recurring "+count+" times");
    }
}
