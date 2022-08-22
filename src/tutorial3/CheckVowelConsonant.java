package tutorial3;

import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Alphabet");
        char ch=sc.nextLine().trim().charAt(0);
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o'
                || ch=='O' || ch=='u' || ch=='U')
            System.out.println("Vowel");
        else
            System.out.println("Consonants");
    }
}
