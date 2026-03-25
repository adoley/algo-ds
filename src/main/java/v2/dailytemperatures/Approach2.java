package v2.dailytemperatures;

import java.util.Arrays;
import java.util.Stack;

/**
 * The approach is to use stack.
 * Algo
 * (1) Create and stack of size equivalent to the size of the input array
 * (2) Start from the last index of the input array i.e. the temperatures array
 *      (a) if the stack is empty, push the index to the stack
 *      (b) else
 *            (i) pop the elements from the stack till a temperature is found or stack is empty
 *            (ii) if higher temperature is found add the diff of the current index of the iteration and the index from the stack
 *                to the result array
 *            (iii) push the current index to the stack
 *
 *   Runtime complexity: O(n), where n is the length of the temperature array
 *   Space complexity: O(n), the space complexity is due to the stack that we used
 */
public class Approach2 {
    public static void main(String[] args) {
      int[] temperatures = {73,74,75,71,69,72,76,73}; //[1,1,4,2,1,1,0,0]
        // int[] temperatures = {30,40,50,60}; //[1,1,1,0]
        //int[] temperatures = {30,60,90}; //[1,1,0]

        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    private static int[] dailyTemperatures(int[] temperatures) {
       int[] result=new int[temperatures.length];
        Stack<Integer> indexStack=new Stack<>();
       for(int i= temperatures.length-1;i>=0;i--){
            while (!indexStack.isEmpty()){
                if(temperatures[indexStack.peek()]>temperatures[i]){
                    result[i]=indexStack.peek()-i;
                    break;
                }else{
                    indexStack.pop();
                }
            }

            indexStack.push(i);
       }

       return result;
    }
}
