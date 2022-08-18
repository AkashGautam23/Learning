package tutorial1;
import java.util.Scanner;

public class KeepTakingNumber {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num=0,sum = 0;
        System.out.println("Enter Number:");
        while(num!='x'){
            num=sc.nextInt();
            sum+=num;
        }
        System.out.println("Sum ="+num);
    }
  }

