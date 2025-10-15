package topKfrequentElements;

import java.util.*;

/**
 * Algo
 * (1) Store the count of ocurence of elements and store it in a Map
 * (2) Use min Heap to store the element and the priority is based on the occurence of the element that is the value of a key in Map
 * (3) Pop the element from Heap to get the result
 */
public class Approach2 {
    public static List<Integer> topFrequentElements(int[] nums, int k){
        List<Integer> result=new ArrayList<>();
        if (nums!=null && nums.length>0){
            Map<Integer,Integer> mapCounter=new HashMap<>();
            for (Integer currentNumber: nums){
                mapCounter.put(currentNumber,mapCounter.getOrDefault(currentNumber,0)+1);
            }

            Queue<Integer> minHeap=new PriorityQueue<>(Comparator.comparingInt(mapCounter::get));
            for (Integer key: mapCounter.keySet()){
                minHeap.add(key);
                if (minHeap.size()>k){
                    minHeap.poll();
                }
            }

            while (!minHeap.isEmpty()){
                result.add(minHeap.poll());
            }
        }

        return result;
    }
}
