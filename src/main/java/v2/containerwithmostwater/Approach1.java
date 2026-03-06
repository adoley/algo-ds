package v2.containerwithmostwater;

/**
 * The approach is to use 2 pointer.
 * left pointer starts from the first index i.e. 0
 * right pointer starts from the last index i.e. nums.length-1
 *
 * find the area
 *      currentArea= (right-left) * Math.min(nums[left],nums[right]);
 *      maxArea= Math.max(maxArea,currentArea)
 *
 *      if nums[left]<=nums[right]
 *           left++;
 *      else right++
 */
public class Approach1 {
    public static void main(String[] args) {
    //   int[] height = {1,8,6,2,5,4,8,3,7};//49
        int[] height = {1,1}; //1

        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
      int maxArea=0;

      if(height!=null && height.length>1){
         int left=0;
         int right= height.length-1;
         while(left<right){
             int currentArea=(right-left)* Math.min(height[left],height[right]);
             maxArea=Math.max(maxArea,currentArea);

             if(height[left]<=height[right]){
                 left++;
             }else{
                 right--;
             }
         }
      }

      return maxArea;
    }
}
