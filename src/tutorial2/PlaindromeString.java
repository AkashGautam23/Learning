package tutorial2;

import java.util.Scanner;

public class PlaindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String :");
        String string=sc.nextLine();
        String reverse="";
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            reverse=ch+reverse;
        }
        if(string.equals(reverse))
            System.out.println("Palindrome String");
        else
           System.out.println("Not a Palindrome String");
    }
}
