package anagram;

import java.util.Arrays;

/**
 * Algo
 * (1) Validation
 *      (a) if s==null or t==null or s.length!=t.length
 *           return false
 * (2) sort the 2 strings
 * (3) if string are equal the return true else false
 *
 * T(n) = n
 * S(n) = n
 * */
public class Approach1 {
    public static boolean isValidAnagram(String s, String t){
        if(s==null || t==null || s.length()!=t.length()){
            return false;
        }
        s=sortString(s);
        t=sortString(t);

        return s.equals(t);
    }

    private static String sortString(String input){
        char[] chars=input.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
