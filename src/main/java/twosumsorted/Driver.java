package twosumsorted;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
//        int[] nums={2,7,11,15};
//        int target=9;

//        int[] nums={2,3,4};
//        int target=6;
        int[] nums={-1,0};
        int target=-1;

        System.out.println(Arrays.toString(Approach1.twoSum(nums,target)));
    }
}
