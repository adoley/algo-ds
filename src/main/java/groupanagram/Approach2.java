package groupanagram;

import java.util.*;

/**
 * Algo
 * (1) Create a Map to store anagrams
 * (2) For each string
 *      (i) compute the key map
 *           (a) create an array of size 26
 *           (b) store the count of each character in the array
 *           (c) iterate through the array and append the count of character to form the key
 *      (ii) check if the map contains the key
 *            (a) if contains key then append the string to value list
 *            (b) else add new entry in the map with the key and value as the string in the list
 *    T(n) : n *k , where n is the number is of string in the input array and k is the average length of string
 *    S(n) : n, where n is the because of Map
 */
public class Approach2 {
    public static List<List<String>> groupAnagram(String[] strs){
        List<List<String>> result=new ArrayList<>();
        if(strs!=null && strs.length>0){
            Map<String, List<String>> map=new HashMap<>();
            for (String current : strs){
                String key=computeKey(current);
                List<String> anagrams;
                if(map.containsKey(key)){
                    anagrams = map.get(key);
                }else {
                    anagrams = new ArrayList<>();
                }
                anagrams.add(current);
                map.put(key,anagrams);
            }

            for (String key : map.keySet()){
                result.add(map.get(key));
            }
        }

        return result;
    }

    private static String computeKey(String input){
        int[] counter=new int[26];
        for(int i=0;i<input.length();i++){
            int index= input.charAt(i)-'a';
            counter[index]=counter[index]+1;
        }

        return Arrays.toString(counter);
    }
}
