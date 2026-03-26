package v2.binarysearch;

public class Approach1 {
    public static void main(String[] args) {
//        int[] nums = {-1,0,3,5,9,12};
//        int target = 9; //4

        int[] nums = {-1,0,3,5,9,12};
        int target = 2; //-1

        System.out.println(search(nums,target));
    }

    private static int search(int[] nums, int target) {
      int result=-1;
      int left=0;
      int right=nums.length-1;

        while (left <= right) {
            int mid=left+ (right-left)/2;
            if(nums[mid]==target){
                result=mid;
                break;
            }

            if(nums[mid]>target){
                right=mid-1;
            }else {
                left=left+1;
            }
        }

      return result;
    }
}
