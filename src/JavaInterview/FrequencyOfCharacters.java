package JavaInterview;

public class FrequencyOfCharacters {
    public static void main(String[] args){
        String str = "AASSCCHHH";
        String nonDup = "";

        for(int i = 0; i <= str.length()-1; i++){
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup += "" +str.charAt(i);
            }
        }
        String result = "";
        for(int i = 0; i <= nonDup.length()-1; i++){
            int count = 0;
            for(int j =0; j <= str.length()-1; j++){
                if(nonDup.charAt(i) ==str.charAt(j)){
                    count++;
                }
            }
            result += "" +nonDup.charAt(i) + count;
        }

        System.out.println(result);
    }
}
