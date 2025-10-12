package groupanagram;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        //String[] strings={"eat","tea","tan","ate","nat","bat"};
       // String[] strings={""};
        String[] strings={"a"};

        List<List<String>> result=Approach1.groupAnagram(strings);
        System.out.println(result);
    }
}
