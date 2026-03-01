package maxaveragesubarray;

public class Approach1 {
    public static double findMaxAverage(int[] nums, int k) {
        double result=Integer.MIN_VALUE;
        int left=0;
        int right=k-1;
        double sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        result=Math.max(result, sum/k);
        right++;
        while(right<nums.length){
            sum=sum-nums[left]+nums[right];
            result=Math.max(result, sum/k);
            left++;
            right++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums={-2,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
}
