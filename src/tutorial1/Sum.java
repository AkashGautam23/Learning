package tutorial1;
import java.util.Scanner;

    public class Sum {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int first=sc.nextInt();
        System.out.println("Enter Second Number");
        int second=sc.nextInt();
        int result=first+second;
        System.out.println("Sum of two number is :"+result);
    }
}
