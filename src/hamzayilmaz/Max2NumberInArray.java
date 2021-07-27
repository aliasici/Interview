package hamzayilmaz;

public class Max2NumberInArray {

    public static void main(String[] args) {

        int[] array = {1,4,2,7,9,50,10};

        int max1 =0;
        int max2 = 0;

        for (int each : array) {
            if (each > max1){
                max2 = max1;
                max1 = each;
            }else if(each > max2){
                max2 = each;
            }

        }
        System.out.println(max1 + " , " +max2);
    }
}
