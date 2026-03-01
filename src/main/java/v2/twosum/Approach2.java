package v2.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Use hashmap to store already visited element as key and array index of the element as value
 * Algo
 * (1) For each element in the array
 *      (a) Find the complement from the target
 *      (b) Check if the complement exist in the Map
 *           (i) If the complement exist then return the index of the current element and the index of the complement element.
 *                Return from here with the indexes.
 *           (ii) Else put the current element and index in the Map
 * (2) return empty array
 */
public class Approach2 {
    public static void main(String[] args) {
//        int[] input={1,2,3};
//        int target=6;
//        int[] input={1,2,3,4};
//        int target=8;
//          int[] input= {2,7,11,15};
//          int target=9;
//          int[] input={3,2,4};
//          int target=6;
        int[] input={3,3};
        int target=6;

        int[] result=twoSum(input,target);
        if(result!=null) {
            Arrays.sort(result);
            System.out.println("=====The result======");
            for (int i : result) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("Two sum does not exist");
        }
        System.out.println();
    }

    private static int[] twoSum(int[] input, int target){
        int[] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<input.length;i++){
            int complement=target-input[i];
            if(map.containsKey(complement)){
                result[0]=i;
                result[1]=map.get(complement);
                return result;
            }
            map.put(input[i],i);
        }

        return null;
    }
}
