package Arrays_05;

import java.util.ArrayList;
import java.util.List;

public class KidsGreatestNumberCandies {
    public static void main(String []args){
        int []candy={2,3,5,1,3};
        int extraCandy=3;
        List<Boolean> res = kidsWithCandies(candy, extraCandy);
        System.out.println(res);

    }
    public static List<Boolean> kidsWithCandies(int[] candies,int extraCandies){
        List<Boolean> result=new ArrayList<>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max)
                max=candies[i];
        }
        for(int i:candies){
            if(extraCandies+i>=max)
                result.add(true);
            else
                result.add(false);
        }

        return result;
    }
}
