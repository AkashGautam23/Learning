package Arrays_05;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args){
        int []arr={1,3,5,6};
        System.out.println(Arrays.toString(getConcatenation((arr))));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}

