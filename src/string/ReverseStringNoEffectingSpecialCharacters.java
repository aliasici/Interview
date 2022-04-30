package string;

public class ReverseStringNoEffectingSpecialCharacters {

    public static void main(String[] args) {

        String str = "ab!l?m";
        char[] array = str.toCharArray();

        System.out.println(reverse(array));

    }
    public static char[] reverse(char[] str){

        int l = 0; int r = str.length-1;

        while(l < r){

            if (!Character.isAlphabetic(str[l])){
                l++;
            } else if (!Character.isAlphabetic(str[r])){
                r--;
            }else {

                char temp = str[l];
                str[l] = str[r];
                str[r] = temp;

                l++;
                r--;
            }
        }
        return str;
    }
}
