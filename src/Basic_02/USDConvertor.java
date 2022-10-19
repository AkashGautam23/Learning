package Basic_02;

import java.util.Scanner;

public class USDConvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter INR :");
        double INR=sc.nextDouble();
        double USD=(0.013)*INR;
        System.out.println("USD :"+USD);
    }
}
