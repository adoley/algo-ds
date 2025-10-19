package productofarray;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
//        int[] nums={1,2,3,4};
        int[] nums={-1,1,0,-3,3};
        System.out.println(Arrays.toString(Approach1.productExceptSelf(nums)));
    }
}
