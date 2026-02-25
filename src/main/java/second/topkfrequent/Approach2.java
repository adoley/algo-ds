package second.topkfrequent;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * The approach is to count the frequency of elements and store the count of each element in a Map
 * Use min heap of size k to get the top k elements
 *
 * Time Complexity : O(n) for computing the frequency of each element + O(nlogk) for insertion and removal of element from heap
 *                   O(nlogk)
 * Space Complexity : O(n) map for storing the frequency + O(k) for heap
 *                    O(n)
 */
public class Approach2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

//        int[] nums = {1};
//        int k = 1;
//        int[] nums = {1,2,1,2,1,2,3,1,3,2};
//        int k = 2;

        int[] result=topKFrequent(nums,k);

        if(result!=null){
            System.out.println(Arrays.toString(result));
        }
    }

    private static int[] topKFrequent(int[] nums, int k){
        int[] resultantArray=null;
        if(nums!=null && nums.length>0 && k>0){
            Map<Integer,Integer> counterMap=new HashMap<>();
            for(int currentNumber : nums){
                counterMap.put(currentNumber, counterMap.getOrDefault(currentNumber,0)+1);
            }

            PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)-> counterMap.get(a)-counterMap.get(b));
            for(Integer current : counterMap.keySet()){
                heap.add(current);
                if(heap.size()>k){
                    heap.poll();
                }
            }

            resultantArray=new int[heap.size()];
            int totalElement= heap.size();
            for(int i=0;i< totalElement;i++){
                resultantArray[i]= heap.poll();
            }
        }

        return resultantArray;
    }
}
