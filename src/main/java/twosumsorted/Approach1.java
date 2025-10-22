package twosumsorted;

public class Approach1 {
    public static int[] twoSum(int[] nums, int target){
        int[] result=new int[2];

        int leftIndex=0;
        int rightIndex= nums.length-1;

        while (leftIndex<rightIndex){
            int sum=nums[leftIndex]+nums[rightIndex];
            if (sum==target){
                result[0]=leftIndex+1;
                result[1]=rightIndex+1;
                break;
            }else if(sum>target){
                rightIndex--;
            }else {
                leftIndex++;
            }
        }
        return result;
    }
}
