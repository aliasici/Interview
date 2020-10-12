package Cybertek;

public class FirstNonDup {

    public static void main(String[] args) {
        // assak , k

        String str = "asska";
        String goal = "";
        for(int i =0; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            int first = str.indexOf(ch);
            int last = str.lastIndexOf(ch);

            if(first == last){
                goal += "" +ch;
            }


        }
        System.out.println(goal+"");
    }


}
