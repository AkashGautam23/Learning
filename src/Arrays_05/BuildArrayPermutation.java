package Arrays_05;

import java.util.Arrays;

public class BuildArrayPermutation {
    public static void main(String[] args) {
        Solution2 s=new Solution2();
        int []arr={0,2,1,5,3,4};
        System.out.print(Arrays.toString(s.buildArray(arr)));
    }
}
class Solution {
    public int[] buildArray(int[] nums) {
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
class Solution2 {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]+=(nums[nums[i]]%n)*n;
        }
        for(int i=0;i<n;i++){
            nums[i]/=n;
        }
        return nums;
    }
}
