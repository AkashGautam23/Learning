package Basic_02;

import java.util.Scanner;

public class OperatorCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number :");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2= sc.nextInt();
        System.out.println("Enter Operator :");
        char operator=sc.next().charAt(0);
        if(operator=='*')
            System.out.println(num1*num2);
        else if(operator=='+')
            System.out.println(num1+num2);
        else if(operator=='-')
            System.out.println(num1-num2);
        else if(operator=='/')
            System.out.println(num1/num2);
        else if(operator=='%')
            System.out.println(num1%num2);
    }
}
