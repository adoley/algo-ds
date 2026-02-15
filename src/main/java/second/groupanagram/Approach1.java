package second.groupanagram;

import java.util.*;

/**
 * The approach is to use map to store all the anagram.
 * Algo
 * (1) Initialize a Map with key as string and value as List of string
 * (2) for each string in the input list
 *        (i) Sort the current string
 *        (ii) If the sorted string key exist in map then insert the current string
 *        (iii) Else store in map with sorted string as key and current string as value
 * (3) Insert all the values in the map in new arraylist
 *
 * Time complexity: n*nlogn (sorting)
 * Space complexity: n
 *
 */
public class Approach1 {
    public static void main(String[] args) {
        //String[] strs = {"eat","tea","tan","ate","nat","bat"};
        //String[] strs = {"a"};
        String[] strs = {""};
        List<List<String>> result=groupAnagram(strs);
        for (List<String> list: result){
            System.out.println(list);
        }
    }

    private static List<List<String>> groupAnagram(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs != null) {
            if (strs.length == 1 && strs[0] != null && strs[0].trim().equals("")) {
                List<String> temp = new ArrayList<>();
                temp.add("");
                result.add(temp);
            }else {
                Map<String,List<String>> anagramMap=new HashMap<>();
                for(String current : strs){
                    char[] chars= current.toCharArray();
                    Arrays.sort(chars);
                    if(anagramMap.containsKey(Arrays.toString(chars))){
                        List<String> list=anagramMap.get(Arrays.toString(chars));
                        list.add(current);
                        anagramMap.put(Arrays.toString(chars),list);
                    }else {
                        List<String> list=new ArrayList<>();
                        list.add(current);
                        anagramMap.put(Arrays.toString(chars),list);
                    }
                }

                result.addAll(anagramMap.values());
            }
        }

        return result;
    }
}
