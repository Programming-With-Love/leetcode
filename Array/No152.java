package Array;

/**
 * @author tujietg
 * @date 5/18/20 9:07 AM
 */
public class No152 {

    public static int maxProduct(int[] nums) {
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int mid = 1;
            for (int j = i; j < nums.length; j++) {
                mid *= nums[j];
                if (mid > end) {
                    end = mid;
                }
            }
        }
        return end;
    }

}
