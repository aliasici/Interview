package JavaInterview;

public class hasWord {
    public static void main(String[] args) {
        String str = "badxxx";

        System.out.println(hasBad(str));



    }
    public static boolean hasBad(String str){

        if(str.length() < 3) {
            return false;
        }else if ((str.substring(0,3)).equals("bad")){
            return true;
        } else if((str.length() > 3) && str.substring(1,4).equals("bad")) {
            return true;
        }
        return false;

        // merhaba


    }
}


