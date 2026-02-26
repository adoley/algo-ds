package second.issubsequence;

/**
 * The approach is to find a character in a sub array.
 *
 * Time complexity : O(s) * O(t), where s is the length of input s and t is the length of string t
 * Space complexity : O(1)
 */
public class Approach1 {
    public static void main(String[] args) {
//       String s = "abc";
//       String t = "ahbgdc";

//        String s = "axc";
//        String t = "ahbgdc";

        String s = "ahbgdc";
        String t = "abc";

        System.out.println("is subsequence : "+isSubsequence(s,t));
    }

    private static boolean isSubsequence(String s, String t) {
        boolean validSubsequence = false;

        if(s!=null && t!=null && s.length()<=t.length()){
            int characterFound=0;
            int index=0;
            for(int i=0;i<s.length();i++){
                index=getCharacterIndex(s.charAt(i),t,index);
                if (index==-1){
                    break;
                }else{
                    characterFound++;
                    index=index+1;
                }
            }

            if(characterFound==s.length()){
                validSubsequence=true;
            }
        }

        return validSubsequence;
    }

    private static int getCharacterIndex(char charToFind, String input, int startIndex){
        int index=-1;
        for(int i=startIndex; i<input.length();i++){
            if(charToFind==input.charAt(i)){
                index=i;
                break;
            }
        }
        return index;
    }

}
