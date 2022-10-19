package Functions_04;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("Maximum among three numbers"+Max(num1,num2,num3));
        System.out.println("Minimum among three numbers"+Min(num1,num2,num3));
    }
    static int Max(int a, int b,int c){
        if(a>b && a>c){
                return a;
        }
        else if(b>a && b>c){
                return b;
        }
        else return c;
    }
    static int Min(int a, int b,int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else return c;
    }
}
