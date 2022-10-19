package ConditionalLoops_03;

import java.util.Scanner;

public class EvenDaysOfMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month");
        String month=sc.nextLine();
        switch(month) {
            case "January" -> System.out.println("You can go "+31/2+" days out");
            case "February" -> System.out.println("You can go "+28/2+" days out");
            case "March" ->System.out.println("You can go  "+31/2+" days out");
            case "April" -> System.out.println("You can go "+30/2+" days out");
            case "May" -> System.out.println("You can go  "+31/2+"  days out");
            case "June" ->System.out.println("You can go "+30/2+"  days out");
            case "July"->System.out.println("You can go  "+31/2+"   days out");
            case "August"->System.out.println("You can go   "+31/2+" days out");
            case "September"->System.out.println("You can  go "+30/2+" days out");
            case "October"-> System.out.println("You  can go "+31/2+" days out");
            case "November"-> System.out.println("You can go "+30/2+" days  out");
            case "December"-> System.out.println("You  can go "+31/2+"  days out");
            default->System.out.println("Please provide input with valid month name :");
        }
    }
}
