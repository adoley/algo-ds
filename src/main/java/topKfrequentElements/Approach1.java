package topKfrequentElements;

import java.util.*;

/**
 * Algo
 * (1) Store the frequency of each number in a Map
 * (2) Create an array/bucket of type List<Integer> and of size of input array
 * (3) for each key in Map
 *       (a) if the count/frequency is 5 then store the key in index 5 of the array/bucket created in step 2
 * (4) Find the top k frequent elements
 *        (a) start from last index and move towards index 0 of array/bucket as the max frequent elements will be at rightest side
 *        (b) if elements exist in that index then add the elements to resultant array
 *        (c) repeat the steps till k top frequent elements are found
 *
 */
public class Approach1 {
    public static List<Integer> topFrequentElements(int[] nums, int k){
        List<Integer> result =new ArrayList<>();
        if(nums!=null && nums.length>0){
            Map<Integer,Integer> counterMap=new HashMap<>();
            for (int i: nums){
                counterMap.put(i, counterMap.getOrDefault(i,0)+1);
            }
            List<Integer>[] counterArray=new ArrayList[nums.length+1];
            for (int key: counterMap.keySet()){
                if(counterArray[counterMap.get(key)]!=null){
                    counterArray[counterMap.get(key)].add(key);
                }else {
                    List<Integer> list=new ArrayList<>();
                    list.add(key);
                    counterArray[counterMap.get(key)]=list;
                }
            }

            int index= nums.length;
            while (index>0 && k>0){
                if(counterArray[index]!=null){
                    List<Integer> list=counterArray[index];
                    if(list.size()>=k){
                        for(int i=0;i<k;i++){
                            result.add(list.get(i));
                        }
                        break;
                    }else {
                        int numberOfElements=list.size();
                        result.addAll(list);
                        k=k-numberOfElements;
                    }
                }
                index--;
            }
        }

        return result;
    }
}
