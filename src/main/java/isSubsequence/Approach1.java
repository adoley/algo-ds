package isSubsequence;

/**
 * Algo
 * (1) Use two pointers to compare the character in the given two strings.
 * One pointer will be pointing to the characters in first string and second pointer will point to characters of second string
 * (2) if the both the pointer character matches then increment both the pointers
 * (3) else just the pointer of second string to point to next character
 * (4) continue step 2 and 3 till either of the pointer crossed the last character
 *
 * T(n) : O(n) where n is the length of the longest string
 * S(n) : O(1)
 *
 * */
public class Approach1 {
    public static boolean isSubsequence(String s,String t){
        if (s.length()>t.length())
            return false;
        int sStringPointer=0;
        int tStringPointer=0;

        while (sStringPointer<s.length() && tStringPointer<t.length()){
            if(s.charAt(sStringPointer)==t.charAt(tStringPointer)){
                sStringPointer++;
            }
            tStringPointer++;
        }
        return sStringPointer==s.length();
    }
}
