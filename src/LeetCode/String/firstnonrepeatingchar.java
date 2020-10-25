package LeetCode.String;

import java.util.HashMap;

public class firstnonrepeatingchar {
    public static void main(String[] args) {
        String str = "ali";
        System.out.println(firstUniqChar(str));

    }
    public static int firstUniqChar(String str){

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char current = str.charAt(i);

            if(!map.containsKey(current)){
                map.put(current, i);
            }else {
                map.put(current, -1);
            }
        }
        // a => 1, b => 3, c=> -1
        int min = Integer.MAX_VALUE;
        for(char ch : map.keySet()){
            if(map.get(ch) > -1 && map.get(ch) < min){
                min = map.get(ch);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;

    }
}
