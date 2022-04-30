package fasttrack;

import java.util.Scanner;

public class InitialName {

    public static void main(String[] args) {

        System.out.println("Enter your first name last name: ");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();


       int indexOfWhiteSpace = name.indexOf(' ');

      //  System.out.println(indexOfWhiteSpace);
        String firstName = name.substring(0,indexOfWhiteSpace);
        String lastName = name.substring(indexOfWhiteSpace+1,name.length());

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println("Initial of the name: "+name.substring(0,1)+"."+name.substring(indexOfWhiteSpace+1,indexOfWhiteSpace+2));
    }
}
