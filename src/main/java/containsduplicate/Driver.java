package containsduplicate;

public class Driver {
    public static void main(String[] args) {
//        int[] nums={1,2,3,1};
//        int[] nums={1,2,3,4};
        int[] nums={1,1,1,3,3,4,3,2,4,2};
        System.out.println("Contains duplicate : "+Approach1.containsDuplicate(nums));
    }
}
