package Arrays_05;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String []args){
    int []arr={1,2,3,4,4,3,2,1};
    int n=4;
    System.out.println(Arrays.toString(shuffle(arr,n)));

    }
    public static int []shuffle(int []nums,int n){
        int []ans=new int[nums.length];
        int firstPart=0;
        int secondPart=n;
        for(int i=0;i<nums.length;){
            ans[i++]=nums[firstPart++];
            ans[i++]=nums[secondPart++];
        }
    return ans;
    }
}
