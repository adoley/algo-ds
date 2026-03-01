package v2.productexceptself;

import java.util.Arrays;

/**
 * For each element nums[i],
 *    (a) we find the product of all the element on the left side i.e from index 0 to i-1
 *    (b) we find the product of all the element on the right side i.e from index i+1 to n
 *    (c) now find result by multiplying left and right product and add it to the resultant array
 *
 *  Time complexity : n^2
 *  Space complexity : 1
 */
public class Approach1 {
    public static void main(String[] args) {
       // int[] nums = {1,2,3,4};//Output: [24,12,8,6]
        int[] nums = {-1,1,0,-3,3}; // Output: [0,0,9,0,0]

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] result=null;
        if(nums!=null){
            if(nums.length==1){
                result=new int[1];
                result[0]=1;
            }else {
                result=new int[nums.length];
                for(int i=0;i<nums.length;i++){
                    int left=1;
                    for(int j=0;j<i;j++){
                        left=left*nums[j];
                    }

                    int right=1;
                    for(int k=i+1;k< nums.length;k++){
                        right=right*nums[k];
                    }

                    result[i]=left*right;
                }
            }
        }

        return result;
    }
}
