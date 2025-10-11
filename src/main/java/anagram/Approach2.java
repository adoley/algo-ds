package anagram;

import java.util.HashMap;
import java.util.Map;

/**
 * Input string "s" and "t"
 *
 * Algo
 * (1) Validation and base case
 *       (a) if s or t is null or "s" length is not equal to "t" length
 *            return false
 * (2) Use Map to store count of each character
 * (3) For each character in "s" store the count of each character in Map
 * with the character as key and number of occurrence as value
 * (4) For each character in "t"
 *       (a) If the character doesn't exist in Map then return false
 *       (b) Else decrement the counter of character by 1
 *            (i) if the count is zero remove the entry from Map
 * (5) If the Map is not empty then return false else true
 *
 * T(n) : T(s length) + T(t length)
 * S(n) : O(1) as the Map size will be constant and can be of max size 26
 *
 */
public class Approach2 {
    public static boolean isValidAnagram(String s, String t){
        if(s==null || t==null || s.length()!=t.length()){
            return false;
        }

        Map<Character,Integer> charCounter=new HashMap<>();
        for(int i=0; i<s.length();i++){
            char currentChar= s.charAt(i);
            if(charCounter.containsKey(currentChar)){
                int count=charCounter.get(currentChar);
                count++;
                charCounter.put(currentChar,count);
            }else {
                charCounter.put(currentChar,1);
            }
        }

        for (int i=0;i<t.length();i++){
           char currentChar=t.charAt(i);
           if(!charCounter.containsKey(currentChar)){
               return false;
           }

           int count=charCounter.get(currentChar);
           count--;
           if(count==0){
               charCounter.remove(currentChar);
           }else{
              charCounter.put(currentChar,count);
           }
        }
        return charCounter.isEmpty();
    }
}
