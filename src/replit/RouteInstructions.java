package replit;

import java.util.Scanner;

public class RouteInstructions {
    /*
    If start point equals to end point it is OK
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String start = scan.next();
        String end = scan.next();

        /*
        if A - A B C D
        if B -A B C D
        if B -A B C D
        if B -A B C D
         */

        switch (start){
            case "A":
                if (end.equals("A")){
                    System.out.println("A found");
                }else if(end.equals("B")){
                    System.out.println("right: B found");
                }else if(end.equals("C")){
                    System.out.println("right > down: C found");
                }else if(end.equals("D")){
                    System.out.println("right > down > left : D found");
                }

                break;
            case "B":
                if (end.equals("B"))
                break;

            case "C":
                break;

            case "D":
                break;
        }
    }
}
