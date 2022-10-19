package ConditionalLoops_03;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                sum+=i;
        }//for
        if(sum==num)
            System.out.println("Perfect number");
        else
            System.out.println("Not a Perfect number");
    }
}
