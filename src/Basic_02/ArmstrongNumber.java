package Basic_02;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter low and high limit :");
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println("Armstrong Number between "+low+" and "+high+" is :");
        for(int i=low+1;i<high;i++){
            int x=i;
            int n=0;
            while(x!=0){
                x/=10;
                ++n;
            }
            int pow_sum=0;
            x=i;
            while(x!=0){
                int digit=x%10;
                pow_sum+=Math.pow(digit,n);
                x/=10;
            }
            if (pow_sum == i)
                System.out.println(i);
        }
        System.out.println();
    }
}
