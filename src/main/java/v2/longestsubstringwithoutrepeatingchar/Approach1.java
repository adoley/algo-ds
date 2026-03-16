package v2.longestsubstringwithoutrepeatingchar;

import java.util.HashMap;
import java.util.Map;

/**
 * The approach is to use sliding window.
 *  left point to the start of the window
 *  right point to the end of the window
 *  maxSubstringLength is the maxSubstring seen so far
 *  characterIndexMap is Map that keep track of index of the character
 * Algo
 * (1) while right is less than the length of the string
 *     (a) if the characterIndexMap contains the character and the index of the character is greater than or equal to left
 *           (i) update left to characterMapIndex.get(character)+1
 *     (b) characterIndexMap.put(character,right)
 *     (c) maxSubstringLength = Math.max(maxSubstringLength,right-left+1)
 *  (2) return maxSubstringLength
 *
 *  Time Complexity: O(n), where n is the length of the input string
 *  Space Complexity: O(1), as the size of the map can go upto max 26
 */
public class Approach1 {
    public static void main(String[] args) {
       // String s = "abcabcbb";//3
      //  String  s = "bbbbb";//1
        String s = "pwwkew";//3

        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> characterIndexMap = new HashMap<>();
        int maxSubstringLength = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (characterIndexMap.containsKey(currentChar) && characterIndexMap.get(currentChar) >= left) {
                left = characterIndexMap.get(currentChar) + 1;
            }
            characterIndexMap.put(currentChar, right);
            maxSubstringLength = Math.max(maxSubstringLength, right - left + 1);
        }

        return maxSubstringLength;
    }
}
