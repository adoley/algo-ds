package containsduplicate;

import java.util.HashSet;

/**
 * Use set to keep track of the elements that are already visited
 * Algo
 * (1) For each element
 *       (a) If the set contains the element then return true
 *       (b) Else add the element to the set
 * (2) return false
 *
 * T(n) = n
 * S(n) = n
 */
public class Approach2 {
    public static boolean containsDuplicate(int[] nums){
        if (nums!=null){
            HashSet<Integer> visited=new HashSet<>();
            for (int num : nums) {
                if (visited.contains(num)) {
                    return true;
                }
                visited.add(num);
            }
        }
        return false;
    }
}
