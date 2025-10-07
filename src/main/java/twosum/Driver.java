package twosum;

public class Driver {
    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
       int target = 9;
//       int[] nums={3,2,4};
//       int target=6;
//        int[] nums={3,3};
//        int target=6;
//        int[] nums={4,4};
//        int target=6;

       //int[] result=Approach1.twoSum(nums,target);
        int[] result=Approach2.twoSum(nums,target);
       System.out.println("The result");
       for(int i : result){
           if (i>=0) {
               System.out.print(i + " ");
           }
       }
    }
}
