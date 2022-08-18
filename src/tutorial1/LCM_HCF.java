package tutorial1;
import java.util.Scanner;

import static java.lang.Math.*;

public class LCM_HCF {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number :");
        int num1=sc.nextInt();
        System.out.println("Enter Second number :");
        int num2=sc.nextInt();
        int min= min(num1,num2);
        int hcf=1;
        for(int i=1;i<=min;i++){
            if(num1%i==0 && num2%i==0)
                hcf=i;
        }
        System.out.println("HCF :"+hcf);
        int lcm=(num1*num2)/hcf;
        System.out.println("LCM :"+lcm);
    }
}
