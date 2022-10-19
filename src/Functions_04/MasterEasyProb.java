package Functions_04;

import java.util.Scanner;

public class MasterEasyProb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age :");
        int age =sc.nextInt();
        System.out.println("The person is "+CheckEligibility(age));
        System.out.println("Enter Number to be added :");
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum :"+sum(a,b));
        System.out.println("Enter Number to be multiply :");
        int c=sc.nextInt();
        int d= sc.nextInt();
        System.out.println("Sum :"+Multiply(c,d));
        System.out.println("Enter number :");
        int e=sc.nextInt();
        System.out.println("Number entered :"+CheckPrime(e));
    }

     static String CheckEligibility(int age) {
        if(age>=18)
            return "Eligible";
        else return  "Not eligible";
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int Multiply(int a, int b){
        return a*b;
    }
    static String CheckPrime(int num){
        if(num<=1)
            return "Not Prime";
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return "Not Prime";
        }
        return "Prime";
    }
}
