package v2.validparentheses;

import java.util.Stack;

/**
 * The approach is use Stack for pushing into stack if the character is of type open bracket and pop if the bracket
 * is of type close bracket.
 *   return false if the open and close bracket type is not match
 *   Also return false if the stack is not empty after all the character in the string are processed.
 *
 *   Time complexity: O(n), where n is the size of the input string
 *   Space complexity: O(n), as we will use stack to store the characters
 */
public class Approach1 {
    public static void main(String[] args) {
        //String s = "()"; //true
       // String s = "()[]{}";// true
       // String s = "(]";//false
       // String s = "([])"; //true
        String s = "([)]"; //false

        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            Character currentChar=s.charAt(i);
            if(currentChar.equals('(') || currentChar.equals('{') || currentChar.equals('[')){
                stack.push(currentChar);
            }else if(currentChar.equals(')') && !stack.isEmpty() && stack.peek().equals('(')){
                    stack.pop();
            }else if(currentChar.equals('}') && !stack.isEmpty() && stack.peek().equals('{')){
                stack.pop();
            }else if(currentChar.equals(']') && !stack.isEmpty() && stack.peek().equals('[')){
                stack.pop();
            }else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
