package tutorial3;

import java.util.Scanner;

public class OccurenceCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        System.out.println("Enter number for which you want to find occurence :");
        int occ=sc.nextInt();
        int count=0;
        while(num!=0){
            int temp=num%10;
            num/=10;
            if(temp==occ)
                count++;
        }
        System.out.println(count);
    }
}
