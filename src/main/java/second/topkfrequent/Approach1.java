package second.topkfrequent;

import java.util.*;

/*
The approach is to count the frequency of each element and store it in Map.
Key will be the element itself and value will be the frequency.
Create an array of size equivalent to the size of an input array
Iterate through the map.
    for each element
       get the value i.e. frequency of the element
       store the element at index of the frequency
          For example: If the frequency of number 5 is 10 then store the element 5 at an index 10 of the array
Iterate from the last index of the array to find the result.


 Time complexity O(n): O(n) (iterate through the input array to calculate frequency)
                            + O(n) (iterate through the map) + O(n) (for finding the result)
                     : O(n)
 Space complexity O(n): O(n) for extra Map + O(n) for extra array
 */
public class Approach1 {
    public static void main(String[] args) {
//        int[] nums = {1,1,1,2,2,3};
//        int k = 2;

//        int[] nums = {1};
//        int k = 1;
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;

        int[] result=topKFrequent(nums,k);

        if(result!=null){
            System.out.println(Arrays.toString(result));
        }

    }

    private static int[] topKFrequent(int[] nums, int k){
        int[] resultantArray=null;
        if(nums!=null && nums.length>0 && k>0){
            Map<Integer,Integer> counterMap=new HashMap<>();
            for (int num : nums) {
                counterMap.put(num, counterMap.getOrDefault(num, 0) + 1);
            }


            Object[] frequencyToIndexMappingArray= new Object[nums.length+1];
            for(Integer key: counterMap.keySet()){
                List<Integer> temp;
                if(frequencyToIndexMappingArray[counterMap.get(key)]==null){
                    temp = new ArrayList<>();
                }else{
                    temp = (List<Integer>) frequencyToIndexMappingArray[counterMap.get(key)];
                }
                temp.add(key);
                frequencyToIndexMappingArray[counterMap.get(key)]=temp;
            }

            List<Integer> tempResultList=new ArrayList<>();
            for(int i= nums.length;i>0;i--){
                if(tempResultList.size()<k){
                    if(frequencyToIndexMappingArray[i]!=null){
                        List<Integer> list=(List<Integer>) frequencyToIndexMappingArray[i];
                        for (Integer integer : list) {
                            if (tempResultList.size() < k) {
                                tempResultList.add(integer);
                            }
                        }
                    }
                }else {
                    break;
                }
            }
             resultantArray=new int[tempResultList.size()];
            for(int j=0; j< tempResultList.size();j++){
                resultantArray[j]=tempResultList.get(j);
            }
        }

        return resultantArray;
    }
}
