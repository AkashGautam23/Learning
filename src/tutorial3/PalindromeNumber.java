package tutorial3;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int num=sc.nextInt();
        int temp=num;
        int r,sum=0;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num/=10;
        }
        if(temp==sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");
    }
}
