package tutorial2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2=sc.nextInt();
        if(num1>num2)
            System.out.printf("Largest Number is "+num1);
        else
            System.out.println("Largest Number is "+num2);
    }
}
