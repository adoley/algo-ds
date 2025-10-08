package containsduplicate;

/**
 * Algo
 * (1) For each element
 *       (a) find if duplicate element exist in the array,
 *       starting from the next index of the current element till the end of the array
 *       (b) If exist return true
 *  (2) return false
 *
 *  T(n) = n^2
 *  S(n) = 1
 */
class Approach1 {
    public static boolean containsDuplicate(int[] nums){
        if (nums!=null){
            for(int i=0;i< nums.length-1;i++){
                for (int j=i+1;j< nums.length;j++){
                    if(nums[i]==nums[j])
                        return true;
                }
            }
        }
        return false;
    }
}
