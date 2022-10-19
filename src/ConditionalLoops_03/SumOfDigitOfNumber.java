package ConditionalLoops_03;

import java.util.Scanner;

public class SumOfDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int sum=0,temp;
        while(num!=0){
            temp=num%10;
            sum+=temp;
            num/=10;
        }
        System.out.println("Sum of Digit of number "+sum);
    }
}
