package productofarray;

/**
 * Algo
 * (1) Construct the left product array that contain the product of all the element between index 0 and currentIndex-1
 *       (i) Initialize the index 0 of leftProduct with value 1
 *       (ii) leftProduct[n]= leftProduct[n-1] * nums[n-1];
 *
 *(2) Construct then right product array that contain the product of all the element from n+1 to last index of the array
 *       (i) Initialize the last index of the rightProduct with value 1
 *       (ii) rightProduct[n]= rightProduct[n+1]*nums[n+1];
 * (3) Find the resultant array
 *       (i) For each number
 *             result[n]=leftProduct[n]*rightProduct[n];
 * (4) return result;
 *
 * T(n) : O(n)
 * S(n) : O(1)
 *
 */
public class Approach1 {
    public static int[] productExceptSelf(int[] nums){
        int[] leftProduct=new int[nums.length];
        leftProduct[0]=1;
        for(int i=1;i< nums.length;i++){
            leftProduct[i]=leftProduct[i-1]*nums[i-1];
        }

        int[] rightProduct=new int[nums.length];
        rightProduct[nums.length-1]=1;

        for (int i= nums.length-2;i>=0;i--){
            rightProduct[i]=rightProduct[i+1]*nums[i+1];
        }

        int[] result=new int[nums.length];
        for(int i=0;i< nums.length;i++){
            result[i]=leftProduct[i]*rightProduct[i];
        }

        return result;
    }
}
