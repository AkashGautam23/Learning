package Functions_04;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int num= sc.nextInt();
        System.out.println("Factorial :"+CheckFactorial(num));
        System.out.println("Factorial :"+NormalFactorial(num));
    }

     static long CheckFactorial(int num) {
        if(num==1)
            return 1;
        else {
            return num * (CheckFactorial(num - 1));
        }
    }
    static long NormalFactorial(int num){
        long fact;
        if(num==1)
            return 1;
        else{
            fact=1;
            while(num!=1){
                fact*=num;
                num--;
            }
        }
        return fact;
    }
}
