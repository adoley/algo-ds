package second.anagram;

/**
 * The approach is to keep the count of each character in the input string.
 * We can use array or map to keep the count. Here I will use array
 * Algo
 * (1) return false if the length of string are not same.
 * (2) Initialize an array of size 26 to store the count of each letter.
 * (3) for each character of the first string
 *         (i) increment the count by 1 for its corresponding index.
 *               For example if the character is 'a' then increment the count of index 0 by 1
 *                           if the character is 'b' then increment the count of index 1 by 1
 * (4) for each character in the second string
 *         (i) decrement the count by 1 for its corresponding index
 *         (ii) return false if the count is less than 0
 * (5) scan the count array
 *          (i) return false if any index have value less than 0 or greater than 1
 * (6) return true
 *
 */
public class Approach2 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

//        String s = "rat";
//        String t = "car";

        System.out.println(isAnagram(s,t));
    }
    private static boolean isAnagram(String s, String t){
        boolean isAnagramString=false;
        if(s!=null && t!=null && s.length()==t.length()){
            int[] count=new int[26];
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']=count[s.charAt(i)-'a']+1;
            }

            for(int i=0;i<t.length();i++){
                count[t.charAt(i)-'a']=count[t.charAt(i)-'a']-1;
                if(count[t.charAt(i)-'a']<0){
                    return false;
                }
            }
            isAnagramString=true;
        }

        return isAnagramString;
    }
}
