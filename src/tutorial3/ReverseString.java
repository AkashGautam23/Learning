package tutorial3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        StringBuilder reverse= new StringBuilder();
        String string=sc.nextLine();
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            reverse.insert(0, ch);
        }
        System.out.println("Reverse of String :"+reverse);
    }
}
