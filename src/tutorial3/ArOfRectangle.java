package tutorial3;

import java.util.Scanner;

public class ArOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and Width :");
        int length=sc.nextInt();
        int width=sc.nextInt();
        int area=length*width;
        System.out.println("Area of Rectangle :"+area);
    }
}
