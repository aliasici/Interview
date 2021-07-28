package hamzayilmaz;

public class NextLetter {
    public static void main(String[] args) {

        String name = "ZEMZEM"; // AFNAFN

        for (int i = 0; i < name.length(); i++) {

            char letter = name.charAt(i);
            // char nextLetter = letter++;


            if (letter == 'z'){
                letter ='a';

            }else if(letter == 'Z'){
                letter = 'A';

            } else{
                letter++;
            }
            System.out.print(letter);
        }
    }
}
