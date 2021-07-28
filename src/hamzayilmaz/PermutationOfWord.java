package hamzayilmaz;

public class PermutationOfWord {

    public static void main(String[] args) {

        String word = "ABC";

        printOut(word,"");
    }

    private static void printOut(String word, String s) {

        if (word.length() == 0){
            System.out.println(s+" ");
            return;
        }

        for (int i = 0 ; i < word.length(); i++){
            char letter = word.charAt(i);
            String rest = word.substring(0,i) + word.substring(i+1);
            printOut(rest, s +letter);
        }
    }
}
