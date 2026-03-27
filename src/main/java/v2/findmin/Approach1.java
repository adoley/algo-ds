package v2.findmin;

/**
 * The approach is to use binary search as the array is in some form of sorted array
 *
 * Time complexity: log(n), as we are using binary search
 * Space complexity: O(1)
 */
public class Approach1 {
    public static void main(String[] args) {
      //int[] nums={ 3,4,5,1,2};//1
      //  int[] nums={ 4,5,6,7,0,1,2};//0
        int[] nums={11,13,15,17};//11


        System.out.println(findMin(nums));
    }

    private static int findMin(int[] nums) {
         int left=0;
         int right=nums.length-1;
         int min=nums[left];

         while (left<=right){
             int mid=left+(right-left)/2;
             if(left>=0 && nums[left]>nums[mid]){
                 min=nums[mid];
                 break;
             }else if(mid+1<nums.length-1 && nums[mid]>nums[mid+1]){
                 min=nums[mid+1];
                 break;
             }else if(nums[mid]>nums[right]){
                 left=mid+1;
             }else{
                 right=mid-1;
             }
         }
       return min;
    }
}
