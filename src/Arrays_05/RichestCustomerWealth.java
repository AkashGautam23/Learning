package Arrays_05;


public class RichestCustomerWealth {
    public static void main(String []args){
        int [][]arr={{2,8,7,5},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int res=0;
        for (int[] account : accounts) {
            int temp = 0;
            for (int i : account) {
                temp += i;
            }
            res = Math.max(temp, res);
        }
        return res;
    }
}
