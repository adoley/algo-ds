package v2.longestconsecutivesequence;

import java.util.HashMap;
import java.util.Map;

/**
 * The approach is to use map to keep track of the longest sequence
 *
 * Algo
 * (1) Initialized Map to keep track of sequence count and keep track of longest sequence seen so far
 * (2) For each element in the input array
 *       (a) If element-1 exist in the map then
 *               map.put(element, map.get(element-1)+1)
 *               if map.get(element-1)+1 > longestSequence
 *               then update longestSequence=map.get(element-1)+1
 *
 *       (b) else map.put(element, 1)
 *              if (1> longestSequence)
 *              then update longestSequence=1
 *
 *       (c) Loop through till element+1 exist in the map then
 *              map.put(element+1, map.get(element)+1)
 *              if  map.get(element+1)>  longestSequence
 *              then update longestSequence=map.get(element+1)
 *
 */
public class Approach1 {
    public static void main(String[] args) {
     //   int[] nums = {100,4,200,1,3,2};
     //   int[] nums= {0,3,7,2,5,8,4,6,0,1};
        int[] nums={1,0,1,2};


        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums){
        int result=0;
        if(nums!=null && nums.length>0){
            Map<Integer, Integer> map=new HashMap<>();
            for(int num: nums){
                map.put(num,map.getOrDefault(num-1,0)+1);
                if(map.get(num)>result){
                    result=map.get(num);
                }

                int currentNum=num;
                while(true) {
                    if (map.containsKey(currentNum + 1)) {
                        map.put(currentNum + 1, map.get(currentNum) + 1);
                        if (map.get(currentNum + 1) > result) {
                            result = map.get(currentNum + 1);
                        }
                        currentNum=currentNum+1;
                    }else{
                        break;
                    }
                }
            }
        }

        return result;
    }

}
