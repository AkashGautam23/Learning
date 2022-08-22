package tutorial3;

import java.util.Scanner;

public class EvenDaysOfMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month");
        String month=sc.nextLine();
        switch(month) {
            case "January":
                System.out.println("You can go "+31/2+" days out");
                break;
            case "February":
                System.out.println("You can go "+28/2+" days out");
                break;
            case "March":
                System.out.println("You can go  "+31/2+" days out");
                break;
            case "April":
                System.out.println("You can go "+30/2+" days out");
                break;
            case "May":
                System.out.println("You can go  "+31/2+"  days out");
                break;
            case "June":
                System.out.println("You can go "+30/2+"  days out");
                break;
            case "July":
                System.out.println("You can go  "+31/2+"   days out");
                break;
            case "August":
                System.out.println("You can go   "+31/2+" days out");
                break;
            case "September":
                System.out.println("You can  go "+30/2+" days out");
                break;
            case "October":
                System.out.println("You  can go "+31/2+" days out");
                break;
            case "November":
                System.out.println("You can go "+30/2+" days  out");
                break;
            case "December":
                System.out.println("You  can go "+31/2+"  days out");
                break;
            default:
                System.out.println("Please provide input with valid month name :");
        }
    }
}
