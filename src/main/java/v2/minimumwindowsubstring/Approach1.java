package v2.minimumwindowsubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * The approach is to use sliding window.
 * (1) left will point to the start of the window, and it will start from index 0
 *     right will point to the end of the window
 * (2) Find a valid answer
 *         (a) Then reduce the window by increasing the index of left. Continue this till we have a valid answer.
 *
 *
 *  Runtime complexity: O(n), as at max each element will be access 2 times during expansion and reduction of window
 *  Space complexity: O(t), the size of the resultant string that needs to be found
 */
public class Approach1 {
    public static void main(String[] args) {
//        String s = "ADOBECODEBANC";
//        String t = "ABC";

//        String s = "a";
//        String t = "a";
        String s = "a";
        String t = "aa";

        System.out.println(minWindow(s,t));
    }

    private static String minWindow(String s, String t) {
        String result="";
        if(s!=null && t!=null && s.length()>=t.length()){
            Map<Character,Integer> expected=new HashMap<>();
            for(char c: t.toCharArray()){
                expected.put(c,expected.getOrDefault(c,0)+1);
            }
            int left=0;
            int right=0;
            Map<Character,Integer> actual=new HashMap<>();
            while(left<=right && right<s.length()){
                char currentChar=s.charAt(right);
                if(expected.containsKey(currentChar)) {
                    actual.put(currentChar, actual.getOrDefault(currentChar, 0) + 1);

                    //Shrinking the window
                    while (actual.size() == expected.size() && left <= right) {
                        boolean valid = true;
                        for (Character c : expected.keySet()) {
                            if (actual.get(c) < expected.get(c)) {
                                valid = false;
                                break;
                            }
                        }
                        if (valid) {
                            while (left<=right){
                                if(expected.containsKey(s.charAt(left))){
                                    break;
                                }else {
                                    left++;
                                }
                            }
                            if (result.equals("") || (right - left) < result.length()) {
                                result = s.substring(left, right + 1);
                            }
                            char leftChar = s.charAt(left);
                            actual.put(leftChar, actual.get(leftChar) - 1);
                            if (actual.get(leftChar) <= 0) {
                                    actual.remove(leftChar);
                            }
                            left++;
                            while (left<=right){
                                if(expected.containsKey(s.charAt(left))){
                                    break;
                                }else {
                                    left++;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                }
                right++;
            }
        }

        return result;
    }
}
