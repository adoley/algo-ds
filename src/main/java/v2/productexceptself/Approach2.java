package v2.productexceptself;

import java.util.Arrays;

/**
 * The approach is to use additional array to hold product result
 * Algo
 * (1) Create two new array of size equivalent of the input array.
 *        One array at index i will hold product of all the element on the left side.
 *        The other array at index i will hold product of all the element on the right side.
 * (2) fill the left product array
 *       (a) left[0]=1
 *       (b) for index =1 to n
 *            left[i]=nums[i-1]*left[i-1];
 *
 * (3) fill the right product array
 *      (a) right[n-1]=1
 *      (b) for index n-2 to 0
 *           right[i]=nums[i+1]*right[i+1];
 *
 *  (4) Create the resultant array
 *       for index i=0 to n
 *          resultant[i]= left[i]* right[i];
 *
 *  Runtime complexity : O(n) for filling the leftProduct array + O(n) for filling the rightProduct array + O(n) for filling the resultant array
 *                       O(n) //resultant Runtime complexity
 *  Space complexity :  O(n) for leftProduct array + O(n) for right  product array + O(n) for resultant array
 *                      O(n) // resultant Space complexity
 *
 */
public class Approach2 {

    public static void main(String[] args) {
         int[] nums = {1,2,3,4};//Output: [24,12,8,6]
        //int[] nums = {-1,1,0,-3,3}; // Output: [0,0,9,0,0]

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }


    private static int[] productExceptSelf(int[] nums) {
        int[] result=null;
        if(nums!=null){
            if(nums.length==1){
               result=new int[1];
               result[0]=1;
            }else {
                int[] leftProduct=new int[nums.length];
                int[] rightProduct=new int[nums.length];
                result=new int[nums.length];

                leftProduct[0]=1;
                rightProduct[nums.length-1]=1;

                for(int i=1;i< nums.length;i++){
                    leftProduct[i]=leftProduct[i-1]*nums[i-1];
                }

                for(int i= nums.length-2;i>=0;i--){
                    rightProduct[i]=rightProduct[i+1]*nums[i+1];
                }

                for(int i=0; i< nums.length;i++){
                    result[i]=leftProduct[i]*rightProduct[i];
                }
            }
        }

        return result;
    }
}
