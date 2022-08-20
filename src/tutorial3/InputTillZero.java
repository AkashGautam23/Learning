package tutorial3;

import java.util.Scanner;

public class InputTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a series of values (0 to quit):");
        int num, sum = 0;
        while((num=sc.nextInt())!=0){
            sum+=num;
        }
        System.out.println("Sum of all :"+sum);
    }
}
