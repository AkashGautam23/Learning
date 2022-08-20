package tutorial3;

import java.util.Scanner;

public class InputTillZeroLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a series of values (0 to quit): ");
        int input,largest=0;
        while((input=sc.nextInt())!=0){
            if(input>largest)
                largest=input;
        }
        System.out.println("Largest Number :"+largest);
    }
}
