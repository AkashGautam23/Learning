package ConditionalLoops_03;

import java.util.Scanner;

public class ArOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius :");
        int radius=sc.nextInt();
        double area=Math.PI*Math.pow(radius,2);
        System.out.println("Area of Circle is :"+area);
    }
}
