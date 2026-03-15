package v2.longestrepeatingcharacter;

import java.util.HashMap;
import java.util.Map;

/**
 * The approach is to use sliding window approach.
 *
 * left represent the start of the window
 * right represent the end of the window
 * width represent right-left
 * maxFrequency represent the count of the character that has highest occurrence in the widow
 * counts is a map that keep track of the count of each character in the window
 * maxLength is the max window width that can be achieved by replacing k character
 *
 * Algo
 *(1) start the window from index 0
 *(2) for each character
 *      (a) increment the count of the character in the map
 *      (b) if the count of the character is greater than the maxFrequency then update with the character count
 *      (c) contracts the window from left side till the width of the window is greater than k i.e. the allowed number of replacement
 *      (d) if the window width is greater than maxLength then update the maxLength
 * (3) return the maxLength
 *
 * Time complexity: O(n), where n is the length of the string
 * Space complexity: O(1) as the size of the count map can be at max 26
 *
 */
public class LongestCharacterReplacement {
    public static void main(String[] args) {
//        String s = "ABAB";
//        int k = 2; //4

        String s = "AABABBA";
        int k = 1; //4
        System.out.println(characterReplacement(s,k));
    }

    private static int characterReplacement(String s, int k) {
      int maxLength=0;
      if(s!=null && !s.isBlank() && k>0){
          Map<Character,Integer> count=new HashMap<>();
          int left=0;
          int right;
          int maxFrequency=0;
          for(right=0;right<s.length();right++){
              char currentChar=s.charAt(right);
              int currentCharCount=count.getOrDefault(currentChar,0)+1;
             count.put(currentChar,currentCharCount);
             maxFrequency=Math.max(maxFrequency,currentCharCount);

             while (right-left+1 -maxFrequency >k){
                 char leftChar=s.charAt(left);
                 int leftCharCount=count.get(leftChar)-1;
                 count.put(leftChar,leftCharCount);
                 left++;
             }
             maxLength=Math.max(maxLength,right-left+1);
          }
      }

      return maxLength;
    }
}
