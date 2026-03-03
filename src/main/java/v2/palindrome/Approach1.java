package v2.palindrome;

/**
 * The approach is to use 2 pointers approach.
 * The left pointer will start from index 0 and right pointer will start from the last index.
 * If left pointer and right pointer meets then the input string is a palindrome.
 *
 * Need to take care of input sanitization like converting the uppercase to lowercase.
 *
 * Rum Time complexity : O(n)
 * Space time complexity : O(1)
 *
 */
public class Approach1 {

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama"; //true
//        String s = "race a car"; //false
          String s = " "; //true
        System.out.println("Is palindrome : "+isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
          boolean isPalindromeString=false;
          if(s!=null){
              s=s.trim();
              if(s.length()<=1){
                  isPalindromeString=true;
              }else {
                  s=s.toLowerCase();
                  int leftPointer=0;
                  int rightPointer=s.length()-1;
                  isPalindromeString=true;
                  while (leftPointer<rightPointer){
                      if(!Character.isLetterOrDigit(s.charAt(leftPointer))){
                          leftPointer++;
                      }else if(!Character.isLetterOrDigit(s.charAt(rightPointer))){
                         rightPointer--;
                      }else{
                          if(s.charAt(leftPointer)!=s.charAt(rightPointer)){
                              isPalindromeString=false;
                              break;
                          }
                          leftPointer++;
                          rightPointer--;
                      }
                  }
              }
          }

          return isPalindromeString;
    }
}
