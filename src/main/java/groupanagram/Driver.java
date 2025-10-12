package groupanagram;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        String[] strings={"eat","tea","tan","ate","nat","bat"};
       // String[] strings={""};
       // String[] strings={"a"};

        List<List<String>> approach1Result=Approach1.groupAnagram(strings);
        System.out.println(approach1Result);

        List<List<String>> approach2Result=Approach2.groupAnagram(strings);
        System.out.println(approach2Result);
    }
}
