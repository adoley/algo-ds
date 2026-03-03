package v2.twosumii;

import java.util.Arrays;

/**
 * The approach is to use two pointers. leftPointer start at index 0 and rightPointer at last index
 * compute the sum of element at index leftPointer and rightPointer
 *      if the sum is greater than the target then decrement the rightPointer index by 1
 *      if the sum is less than the target then increment the leftPointer index by 1
 *      if the sum is equal to the target then return the leftPointer and rightPointer index as a result
 *
 * Run time complexity : O(n)
 * Space complexity : O(1)
 */
public class Approach1 {
    public static void main(String[] args) {
//       int[] numbers = {2,7,11,15};
//       int target = 9;  //[1,2]

//        int[] numbers = {2,3,4};
//        int target = 6;  //[1,3]

        int[] numbers = {-1,0};
        int target=-1;// [1,2]

        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }

    private static int[] twoSum(int[] numbers, int target) {

        if(numbers!=null){
            int leftPointer=0;
            int rightPointer= numbers.length-1;

            while (leftPointer<rightPointer){
                int sum=numbers[leftPointer]+numbers[rightPointer];
                if(sum==target){
                    return new int[]{leftPointer+1, rightPointer+1};
                }

                if(sum>target){
                    rightPointer--;
                }else {
                    leftPointer++;
                }
            }
        }
        return new int[]{};
    }
}
