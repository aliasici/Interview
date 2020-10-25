package LeetCode.String;

public class ValidAnagram {
    public static void main(String[] args) {
        // given two strings a and t , write a function to determine if t is an anagram of s
        //you assume that strings contain only lowercase
        // at and ta ==> RETURN TRUE
        System.out.println(isAnagram("asici","icisa"));

    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] counts = new int[26]; // there are 26 lowercase letters
        for(int i = 0; i < s.length(); i++){
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for(int each : counts){
            if(each != 0){
                return false;
            }
        }
        return true;


    }

}
