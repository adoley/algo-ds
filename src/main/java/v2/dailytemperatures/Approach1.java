package v2.dailytemperatures;

import java.util.Arrays;

/**
 * The approach is to use bruteforce approach, for each temperature, we search for first occurrence of higher
 * temperature starting from the next index.
 *
 * Runtime complexity: O(n^2)
 * Space complexity: O(1)
 */
public class Approach1 {
    public static void main(String[] args) {
//      int[] temperatures = {73,74,75,71,69,72,76,73}; //[1,1,4,2,1,1,0,0]
       // int[] temperatures = {30,40,50,60}; //[1,1,1,0]
        int[] temperatures = {30,60,90}; //[1,1,0]


        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    private static int[] dailyTemperatures(int[] temperatures) {
        int[] result=new int[temperatures.length];

        for(int i=0;i< temperatures.length;i++){
            //Step 1 get the current temperature
            int currentTemperature=temperatures[i];
            //step 2 scan through the temperature array to find the higher temperature
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]>currentTemperature){
                    //Step 3 update the result array
                    result[i]=j-i;
                    break;
                }
            }
        }
        return result;
    }
}
