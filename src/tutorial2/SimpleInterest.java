package tutorial2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle:");
        double principle=sc.nextDouble();
        System.out.println("Enter Time:");
        double time=sc.nextDouble();
        System.out.println("Enter rate:");
        double rate=sc.nextDouble();
        double simpleintnterest=principle*time*rate;
        System.out.println("Simple Interest for given principle "+principle+" at "+rate+" in provided time interval "
        + time+" is :"+simpleintnterest);
    }
}
