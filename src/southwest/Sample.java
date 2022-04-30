package southwest;

public class Sample {

    public static void main(String[] args) {

       String someString = "aliasicimalimyarimelim";
       pgmSample(someString,'a',0);
       



    }

    public static int pgmSample(String someString, char searchedChar, int index) {
        if (index >= someString.length()) {
            return 0;
        }

        int count = someString.charAt(index) == searchedChar ? 1 : 0;
        return count + pgmSample (someString, searchedChar, index + 1);
    }
}
