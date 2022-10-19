package Functions_04;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks=sc.nextInt();
        System.out.println("Garde :"+CheckGrade(marks));
    }

    static String CheckGrade(int marks) {
        if (marks > 90 && marks < 101)
            return "AA";
        else if (marks > 80 && marks < 91)
            return "AB";
        else if (marks > 70 && marks < 81)
            return "BB";
        else if (marks > 60 && marks < 71)
            return "BC";
        else if (marks > 50 && marks < 61)
            return "CD";
        else if (marks > 40 && marks < 51)
            return "DD";
        else return "Fail";
    }
}
