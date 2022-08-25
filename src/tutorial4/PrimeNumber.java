package tutorial4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range :");
        int range1= sc.nextInt();
        int range2=sc.nextInt();
        Primenums(range1,range2);
    }
    static void Primenums(int a,int b) {
            while(a<=b){
                if(CheckPrime(a)){
                    System.out.println(a);
                }
                a++;
            }//while
    }//function
    static boolean CheckPrime(int num){
        if(num<1)
            return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}//main
