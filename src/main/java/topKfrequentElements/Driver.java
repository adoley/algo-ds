package topKfrequentElements;

public class Driver {
    public static void main(String[] args) {
//        int[] nums={1,1,1,2,2,3};
//        int k=2;

//        int[] nums={1};
//        int k=1;

        int[] nums={1,2,1,2,1,2,3,1,3,2,3,3,3,3,3,3,3};
        int k=2;

        System.out.println(Approach1.topFrequentElements(nums,k));
    }
}
