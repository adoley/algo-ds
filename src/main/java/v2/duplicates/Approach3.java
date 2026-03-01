package v2.duplicates;

import java.util.HashMap;
import java.util.Map;

/**
 * The approach is to use extra datastructure map to store already seen element from the input array
 * In this way time complexity will be O(n) and space complexity will be O(n)
 * Algo
 * (1) Initialize map to store already seen element
 * (2) For each element in an array
 *      (a) If the element is present in the Map then return true
 *      (b) Else store the element as a key and index as a value. Storing the index as value just to avoid storing null value.
 *  (3) return false
 *
 *  Time complexity : O(n)
 *  Space complexity : O(n)
 */
public class Approach3 {
    public static void main(String[] args) {
        //int[] input={1,2,3,1};
        //int[] input={1,2,3,4};
        //int[] input={1,1,1,3,3,4,3,2,4,2};
        //int[] input={1};
        int[] input=null;

        boolean containDuplicate=containsDuplicate(input);
        System.out.println("Contains duplicate : "+containDuplicate);
    }

    private static boolean containsDuplicate(int[] input){
        Map<Integer,Integer> map=new HashMap<>();
        if(input!=null && input.length>1){
            for(int i=0;i< input.length;i++) {
                if (map.containsKey(input[i])){
                    return true;
                }
                map.put(input[i],i);
            }
        }

        return false;
    }
}
