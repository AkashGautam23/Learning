package tutorial4;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        System.out.println("Number entered is :"+checkeven(num));
    }

     static String checkeven(int num) {
        if(num%2==0)
            return "Even";
        else return "Odd";
    }
}
