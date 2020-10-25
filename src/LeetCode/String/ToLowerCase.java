package LeetCode.String;

public class ToLowerCase {
    public static void main(String[] args) {
        String str = "ASKIM";
        System.out.println(lowerCase(str));

    }
    public static String lowerCase(String str){

        String result = "";
        for(char ch : str.toCharArray()){

            if(Character.isUpperCase(ch)){
                result = result + (char)(ch +32);

            }else {
                result = result +ch;
            }

        }
        return result;
    }
}
