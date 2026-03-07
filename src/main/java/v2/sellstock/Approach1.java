package v2.sellstock;

/**
 * The approach is to compute the max selling price (sp) and min cost price (cp).
 *
 * Runtime complexity: O(n)
 * Space complexity: O(1)
 */
public class Approach1 {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};// Output: 5
        int[] prices = {7,6,4,3,1};// Output: 0
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int cp=prices[0];
        int sp=0;
        for(int i=1;i<prices.length;i++){
            sp=Math.max(sp,prices[i]-cp);
            cp=Math.min(cp,prices[i]);
        }
        return sp;
    }
}
