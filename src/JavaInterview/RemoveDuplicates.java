package JavaInterview;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCDEFF";
        String result = "";

        for(int i = 0; i <= str.length()-1; i++){
            if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i);

            }
        }
        System.out.println(result);
    }
}
