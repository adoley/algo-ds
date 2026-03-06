package v2.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The approach is to sort the number.
 * Iterate through each element
 *    for the other 2 numbers find the sum (0- element at index i) in the subarray i+1 and n-1 where n is the number in the array
 *
 *
 * Runtime complexity: O(nlogn) for sorting + O(n^2)
 *                     O(n^2)
 * Space complexity: O(n) the space to store the triplet
 */
public class Approach1 {
    public static void main(String[] args) {
      //  int[] nums = {-1,0,1,2,-1,-4}; //[[-1,-1,2],[-1,0,1]]
      //  int[] nums= {0,1,1};//[]
        int[] nums={0,0,0};//[[0,0,0]]

        List<List<Integer>> result=threeSum(nums);
        System.out.println(result);

    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();

        if(nums!=null && nums.length>=3){
            Arrays.sort(nums);
            for(int i=0;i< nums.length-2;i++){
                if(i>0 && nums[i]==nums[i-1]){
                    continue; //skip first element duplication
                }

                int left=i+1;
                int right= nums.length-1;

                while (left<right){
                    int sum=nums[i]+nums[left] + nums[right];
                    if(sum==0){
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while (left<right && nums[left]==nums[left+1]){
                            left++;// skip second element duplication
                        }

                        while (left<right && nums[right]==nums[right-1]){
                            right--;//Skip the duplication of the third element
                        }

                        left++;
                        right--;
                    }else if(sum<0){
                        left++;
                    }else {
                        right--;
                    }
                }
            }

        }

        return result;
    }
}
