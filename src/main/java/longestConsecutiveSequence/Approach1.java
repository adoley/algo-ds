package longestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

/**
 * Algo
 * (1) Copy the numbers from array to set to have only unique elements
 * (2) for each element in set
 *      (a) check if number current-1 exist in the set
 *           (i) If don't exist then means current number is a starting point of a sequence
 *                  (1) if current+1 exist then use counter to count the length of a sequence
 *                  (2) set current= current+1
 *                  (3) repeat above 2 steps
 *
 */
public class Approach1 {
    public static int longestConsecutive(int[] nums){
        if(nums==null || nums.length==0){
           return 0;
        }
        Set<Integer> set=new HashSet<>();
        for (int num: nums){
            set.add(num);
        }
        int longestSequence=0;
        for (Integer num: set){
            if(!set.contains(num-1)){
               int currentSequenceLength=1;
               int currentNum=num;
               while (set.contains(currentNum+1)){
                   currentSequenceLength++;
                   currentNum=currentNum+1;
               }

               longestSequence=Math.max(longestSequence,currentSequenceLength);
            }
        }
        return longestSequence;
    }
}
