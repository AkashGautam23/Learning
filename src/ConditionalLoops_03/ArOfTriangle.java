package ConditionalLoops_03;

import java.util.Scanner;

public class ArOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height and base of triangle");
        double height=sc.nextDouble();
        double base=sc.nextDouble();
        double area= height*base /2;
        System.out.println("Area of Triangle :"+area);
    }
}
