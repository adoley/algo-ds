package v2.anagram;

import java.util.Arrays;

/**
 * The approach is to sort the two strings and compare the strings.
 * Algo
 * (1) If the length of the strings are not same then return false
 * (2) Convert the two string into character array
 * (3) Sort the two character arrays
 * (4) Compare the character in the arrays
 *      (a) If all the character are same then return true
 *      (b) Else return false
 *
 * Runtime complexity : nlogn (for sorting the arrays)
 * Space complexity: n (the store the characters of the string).
 */
public class Approach1 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

//        String s = "rat";
//        String t = "car";

        System.out.println(isAnagram(s,t));
    }

    private static boolean isAnagram(String s,String t){
        boolean isAnagramString=false;
        if(s!=null && t!=null && s.length()==t.length()){
            char[] sChars=s.toCharArray();
            char[] tChars=t.toCharArray();

            Arrays.sort(sChars);
            Arrays.sort(tChars);

            isAnagramString=true;
            for(int i=0;i<s.length();i++){
                if(sChars[i]!=tChars[i]){
                    isAnagramString= false;
                    break;
                }
            }
        }
        return isAnagramString;
    }
}
