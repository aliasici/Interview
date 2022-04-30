package southwest;

import java.util.*;

public class UniquesWithCollections {

    public static void main(String[] args) {

        String str = "AABDFGGFHLMNNEEAAB";

        String uniques = "";

        ArrayList<String> list = new ArrayList<>();

        for (String each : str.split("")) {

            list.add(each);
        }
        for (String each : list){
            int count = Collections.frequency(list,each);
            if (count == 1){

                uniques += each;
            }
        }

        System.out.println(uniques);

        List<String> word = Arrays.asList(str.split(""));

        Set<String > set = new LinkedHashSet<>();
        for (String each : word){
            set.add(each);
        }
        System.out.println(set);
    }


}
