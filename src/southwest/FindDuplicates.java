package southwest;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {

        String[] companies = {"Amazon","Apple","FireFox","Google","Amazon","Azure","Azure","Apple"};

        System.out.println("brute force");
        for (int i =0; i < companies.length ; i++) {
            for (int j =i+1; j < companies.length; j++){
                if (companies[i].equals(companies[j])){

                    System.out.print(" " +companies[i]);
                }
            }

        }

        // Using by HashSet
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++");
        Set<String> set = new HashSet<>();
        for (String each: companies){
            if(set.add(each) == false){
                System.out.print(each+" ");
            }
        }

        //using by HashMap
        System.out.println();
        System.out.println("++++++++++++++++++++");

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String each : companies){
            Integer count = map.get(each);
            if(count == null){
                map.put(each,1);
            }else{
                map.put(each, count +1);
            }
        }
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        for(Map.Entry<String,Integer> entry: entrySet){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
        // String[] companies = {"Amazon","Apple","FireFox","Google","Amazon","Azure","Azure","Apple"};
        Set<String > dataSet = new HashSet<>();

       Set<String> dupSet =  Arrays.asList(companies).stream().filter(e -> !dataSet.add(e)).collect(Collectors.toSet());
        System.out.println(dupSet);
    }
}
