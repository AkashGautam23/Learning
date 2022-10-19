package Arrays_05;

import java.util.Arrays;

public class Running_SumOf_1dArray {
    public static void main (String []args){
        int []arr={3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        int []res=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res[i]=sum;
        }
        return res;
    }
}
