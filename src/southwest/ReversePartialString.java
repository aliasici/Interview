package southwest;

public class ReversePartialString {
    public static void main(String[] args) {


        String str = "alimX";
        char[] arr = str.toCharArray();
        String rev = "";
        String rev2 = "";

        for (int i = arr.length-2; i > -1; i--){

            rev += arr[i];
        }

        for (int i = arr.length-1; i >=0; i--){

            rev2 += arr[i];
        }

        System.out.println(rev);
        System.out.println("rev2 = " + rev2);

    }





}
