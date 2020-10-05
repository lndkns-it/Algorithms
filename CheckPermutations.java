import java.util.HashMap;

public class CheckPermutations {

    public static void main(String[] args) {
        
        System.out.println(checkPermutation("aabc", "abac"));

    }

    public static boolean checkPermutation(String str1, String str2) {

        if(str1.isEmpty() || str2.isEmpty() && str1.length() != str2.length()) {
            return false;
        } 

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < str1.length(); i++){
            reduce(i, str1, map);
            reduce(i, str2, map);
        }

        for (int i = 0; i < str1.length(); i++){
            if(map.get(str1.charAt(i)) % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    public static void reduce(Integer i, String str, HashMap<Character, Integer> map) {
        if(!map.containsKey(str.charAt(i))) {
            map.put(str.charAt(i), 1);
        } else {
            Integer cont = map.get(str.charAt(i));
            map.put(str.charAt(i), cont + 1);
        }
    }
    
}
