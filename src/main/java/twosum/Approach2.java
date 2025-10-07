package twosum;

import java.util.Arrays;

/**
 * Algo
 * (1) Validation
 *      (a) Input array should not be null
 *      (b) Input array length should be greater than or equal to 2
 *      (c) Target should not be null
 *      If any of the validation fail then return [-1,-1]
 * (2) Sort the input array
 * (3) For each element
 *      (a) Subtract this element from the target to get the other number
 *      (b) Find the other number from the elements in the array from the next index of the current element
 *      (c) If the other number is found then return the indices
 * (4) If pair is not found return [-1,-1]
 *
 * T(n) = n * log(n) (log(n) is for binary search)
 * S(n) = 1
 */
public class Approach2 {
    public static int[] twoSum(int[] nums, int target){
        int[] result= new int[2];
        result[0]=-1;
        result[1]=-1;
        if (nums!=null && nums.length>=2){
            Arrays.sort(nums);
            for(int i=0; i< nums.length-1;i++){
                int currentNumber=nums[i];
                int otherNumber=target-currentNumber;
                int otherNumberIndex=binarySearch(nums,i+1,nums.length-1,otherNumber);
                if(otherNumberIndex!=-1){
                    result[0]=i;
                    result[1]=otherNumberIndex;
                    break;
                }
            }
        }

        return result;
    }

    private static int binarySearch(int[] nums, int beginIndex, int endIndex,int searchNumber){
        int result=-1;
        while (beginIndex<=endIndex){
            int mid=(beginIndex+endIndex)/2;
            if (nums[mid]==searchNumber){
                result= mid;
                break;
            }else if (nums[mid]<searchNumber){
                beginIndex=mid+1;
            }else {
                endIndex=mid-1;
            }
        }

        return result;
    }

}
