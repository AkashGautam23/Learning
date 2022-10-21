package Arrays_05;

import java.util.Arrays;

public class CountNumbersSmallerThanCurrentNumber {
    public static void main(String[]args){
        int []arr={6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int []nums){
        int []res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=getData(nums,nums[i]);
        }
    return res;
    }
    public static int getData(int []arr,int temp){
        int count=0;
        for (int j : arr) {
            if (temp > j)
                count++;
        }
    return count;
    }
}
