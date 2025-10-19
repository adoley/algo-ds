package palindrome;

/**
 * Algo
 * (1) Trim the input string, If input string is empty or length is 1 then return true
 * (2) Use two pointer approach where leftPointer will starts from index 0 and rightPointer will start from the last index
 * (3) While leftPointer < rightPointer
 *        (i) for leftPointer move forward till a letter or digit is found
 *        (ii) for rightPointer move backward till a letter or digit is found
 *        (iii) if char at leftPointer and rightPointer are not same then return false
 *        (iv) else leftPointer++ and rightPointer--
 * (4) return true
 */
public class Approach1 {
    public static boolean isPalindrome(String s){
        if(s!=null && !s.isEmpty()){
            int left=0;
            int right=s.length()-1;

            while (left<right){
                while (left<right && !Character.isLetterOrDigit(s.charAt(left))){
                    left++;
                }

                while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
                    right--;
                }

                if (left<right && Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }
}
