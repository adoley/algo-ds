package v2.duplicates;

/**
 * The question is to return true if the input array contains same number at least 2 times
 * Algo
 * (1) For each number starting from index i=0 in the array
 *      (i) If same number exist in the subarray i+1 to n then return true
 * (2) return false
 *
 * Complexity
 * T(n) = n^2
 * S(n) = 1
 *
 */
public class Approach1 {
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
        if(input!=null && input.length>1){
            for(int i=0;i<input.length-1;i++){
                for(int j=i+1;j<input.length;j++){
                    if(input[i]==input[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
