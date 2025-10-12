package groupanagram;

import java.util.*;

/**
 * Algo
 * (1) Create a Map to store anagram together with key as the sorted words and value will be a list containing the anagram
 * (2) for each string
 *      (i) sort the string and assign it to a temporary string
 *      (ii) check if sorted string key exist in map
 *             (a) if exist then add the original string to the value list
 *             (b) else make a new entry in Map with sorted string as key and value as original string in the list
 *      (iii) Prepare the response/result
 *             (a) iterate through the Map and add the value of each key in 2 dimensional list
 *
 *  T(n) : n* k logk, where n is the number of string in the input array, k is the average length of string from the input array
 *  S(n) : n, for the additional Map
 */
public class Approach1 {
    public static List<List<String>> groupAnagram(String[] strs){
        List<List<String>> result=new ArrayList<>();
        if(strs!=null && strs.length>0){
            Map<String,List<String>> anagramMap=new HashMap<>();
            for (String currentString : strs){
                String sortedString=sortString(currentString);
                if(anagramMap.containsKey(sortedString)){
                    List<String> list=anagramMap.get(sortedString);
                    list.add(currentString);
                    anagramMap.put(sortedString,list);
                }else {
                    List<String> list=new ArrayList<>();
                    list.add(currentString);
                    anagramMap.put(sortedString,list);
                }
            }
            for (String key: anagramMap.keySet()){
                result.add(anagramMap.get(key));
            }
        }

        return result;
    }

    private static String sortString(String input){
        char[] chars=input.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
