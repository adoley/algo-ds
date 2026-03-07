package v2.maxaveragesubarray;

/**
 * The approach is to use sliding window.
 * left pointer will start from index 0
 * right pointer will start form index k-1
 *
 * In each iteration left and right  pointer wil be increment by 1 till right pointer reaches the last element
 * Sum will be calculated for each window
 *
 * Once the max sum is available, we will compute the average by dividing it with k
 *
 * Runtime complexity: O(n)
 * Space complexity: O(1)
 */
public class Approach1 {
    public static void main(String[] args) {
//      int[] nums = {1,12,-5,-6,50,3};
//      int k = 4; //Output: 12.75000
        int[] nums = {5};
        int k = 1; //5.00000

      System.out.println(findMaxAverage(nums,k));
    }

    private static  double findMaxAverage(int[] nums, int k) {
       double maxAverage=0;
       if(nums!=null && k>0){
           int currentSum=0;
           for(int i=0;i<k;i++){
               currentSum=currentSum+nums[i];
           }
           int left=0;
           int right=k;

           int maxSum=currentSum;

           while (right< nums.length){
               currentSum=currentSum-nums[left]+nums[right];
               maxSum=Math.max(currentSum,maxSum);
               left++;
               right++;
           }

           maxAverage=(double) maxSum/k;
       }

       return maxAverage;
    }
}
