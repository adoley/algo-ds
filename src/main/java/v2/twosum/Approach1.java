package v2.twosum;

/**
 * Algo
 * (1) for each element
 *     (a) find the other element that sums up to the target
 *     (b) if the element is found then return the index of the elements
 *
 *
 * Runtime: O(n^2)
 * Space complexity: O(1)
 */
public class Approach1 {

    public static int[] twoSums(int[] nums, int target){

        if(nums!=null && nums.length>0){
            for(int i=0;i< nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        int[] result=new int[2];
                        result[0]=i;
                        result[1]=j;
                        return result;
                    }
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
//        int[] nums={1,2,3,4};
//        int target=8;
//          int[] nums= {2,7,11,15};
//          int target=9;
//          int[] nums={3,2,4};
//          int target=6;
           int[] nums={3,3};
           int target=6;
        int[] result=twoSums(nums,target);
        if(result!=null){
            System.out.println("The two numbers are on the indexes ");
            System.out.print(result[0]);
            System.out.print(" "+result[1]);
        }else {
            System.out.println("No pair found");
        }
    }
}
