package string;

import Exeptions.result;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharInString {
    public static void main(String[] args) {
        // ex DDDCCCCBBA == > A1B2C4D3

        String string = "DDDCCCCBBADCBAA";
        System.out.println(frequencyOfCharSortedManner(string));

    }

    public static String frequencyOfCharSortedManner(String str) {

        TreeMap<String, Integer> map = new TreeMap<>(); // SORTED MANNER
        //   Map<String, Integer> map = new HashMap<>();

        for (String each : str.split("")) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);  // TREEMAP E STORE ETTIK
            }
        }
        str = "";
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            str += each.getKey() + "" + each.getValue();
        }

        return str;

    }
}
