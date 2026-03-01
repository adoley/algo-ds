package v2.groupanagram;

import java.util.*;

/**
 * The approach is to store all the anangrams as value to a map and key as count of the characters of the string.
 * Algo
 * (1) Initialize a Map with String as key and List<String> as value.
 * (2) For each string
 *       (a) Initialize a count array of size 26
 *       (b) Increment the count of character at the corresponding index i.e str.charAt[i]-'a'
 *       (c) Convert the count array to string
 *       (d) if the string representation of the count array exist in the map then add the string to value List
 *       (e) else
 *            (i) Initialized a List<String> and the current string
 *            (ii) Put in Map with key as the string representation of the count array and value as the list in above step
 * (3) Construct the result
 *      Iterate through the map add the values to the resultant List<List<String>>
 */
public class Approach2 {
    public static void main(String[] args) {
        //String[] strs = {"eat","tea","tan","ate","nat","bat"};
       // String[] strs = {"a"};
        String[] strs = {""};
        List<List<String>> result=groupAnagram(strs);
        for (List<String> list: result){
            System.out.println(list);
        }
    }

    private static List<List<String>> groupAnagram(String[] strs){
        List<List<String>> result=new ArrayList<>();
        if(strs!=null){
            if(strs.length==1 && strs[0]!=null && strs[0].trim().isEmpty()){
                List<String> list=new ArrayList<>();
                list.add("");
                result.add(list);
            }else {
                Map<String,List<String>> groupAnagramMap=new HashMap<>();
                for(String s: strs){
                    int[] count=new int[26];
                    for(int i=0;i<s.length();i++){
                        int index=s.charAt(i)-'a';
                        count[index]=count[index]+1;
                    }
                    String countString= Arrays.toString(count);
                    List<String> list;
                    if(groupAnagramMap.containsKey(countString)){
                        list = groupAnagramMap.get(countString);
                    }else {
                        list = new ArrayList<>();
                    }
                    list.add(s);
                    groupAnagramMap.put(countString,list);
                }

                result.addAll(groupAnagramMap.values());
            }
        }

        return result;
    }
}
