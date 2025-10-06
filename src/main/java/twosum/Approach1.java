package twosum;

/**
 * Algo
 * (1) For each element
 * (2) Find the other element from rest of the elements and check if sum is equal to the given target.
 * (3) If matches return indices
 *
 * T(n) = n^2
 * S(n) = O(1)
 */
public class Approach1 {
    public static int[] twoSum(int[] nums,int target){
        int[] indices=new int[2];
        indices[0]=-1;
        indices[1]=-1;
        if(nums!=null && nums.length>0){
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                  if(nums[i]+nums[j]==target){
                      indices[0]=i;
                      indices[1]=j;
                      break;
                  }
                }
            }
        }
        return indices;
    }
}
