package twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Algo
 * (1) Validation
 *      (a) Input array should not be null
 *      (b) Input array length should be greater than or equal to 2
 *      (c) Target should not be null
 *      If any of the validation fail then return [-1,-1]
 * (2) Use Map to store the number as key and index as value
 * (3) For each element
 *      (a) Subtract this element from the target to get the remaining number
 *      (b) Check if the remaining number exist in map
 *      (c) If the remaining number is found then return the indices
 * (4) If pair is not found return [-1,-1]
 *
 * T(n) = n
 * S(n) = n because of Map
 */
public class Approach2 {
    public static int[] twoSum(int[] nums, int target){
        int[] result= new int[2];
        result[0]=-1;
        result[1]=-1;
        if (nums!=null && nums.length>=2){
            Map<Integer,Integer> numsIndex=new HashMap<>();
            for(int i=0; i< nums.length;i++){
                int currentNumber=nums[i];
                int otherNumber=target-currentNumber;
                if(numsIndex.containsKey(otherNumber)){
                      result[0]=i;
                      result[1]=numsIndex.get(otherNumber);
                      Arrays.sort(result);
                      break;
                }else {
                    numsIndex.put(currentNumber,i);
                }
            }
        }

        return result;
    }

}
