package second.duplicates;

import java.util.Arrays;

/**
 * The problem is to find if duplicate exist in an array
 * Algo
 * (1) Sort the input array
 * (2) For each element in an array
 *       (i) If element in this index is equal to the element in the next index then return true
 * (3) return false
 *
 * Time complexity = nlogn because of sorting the array
 * space complexity = 1
 */
public class Approach2 {
    public static void main(String[] args) {
        int[] input={1,2,3,1};
        //int[] input={1,2,3,4};
        //int[] input={1,1,1,3,3,4,3,2,4,2};
        //int[] input={1};
        //int[] input=null;

        boolean containDuplicate=containsDuplicate(input);
        System.out.println("Contains duplicate : "+containDuplicate);
    }

    private static boolean containsDuplicate(int[] input){
        if(input!=null && input.length>1){
            Arrays.sort(input);
            for(int i=0;i< input.length-1;i++){
                if(input[i]==input[i+1]){
                    return true;
                }
            }
        }
        return false;
    }
}
