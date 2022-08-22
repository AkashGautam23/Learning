package tutorial3;

import java.util.Scanner;

public class InputTillZeroAction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a series of values (0 to quit): ");
        int num,negativeSum=0,positiveEvenSum=0,positiveOddSum=0;
        while((num=sc.nextInt())!=0){
            if(num<0)
                negativeSum-=num;
            else{
                if(num%2==0)
                    positiveEvenSum+=num;
                else
                    positiveOddSum+=num;
            }
        }
        System.out.println("Sum of Negative number entered :"+negativeSum);
        System.out.println("Sum of Positive even number entered :"+positiveEvenSum);
        System.out.println("Sum of Positive odd number entered :"+positiveOddSum);//while
    }
}
