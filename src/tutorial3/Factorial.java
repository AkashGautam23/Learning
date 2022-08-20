package tutorial3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int num=sc.nextInt();
        int factorial=1;
        while(num!=1){
            factorial*=num;
            num--;
        }
        System.out.println("Factorial :"+factorial);
    }
}
