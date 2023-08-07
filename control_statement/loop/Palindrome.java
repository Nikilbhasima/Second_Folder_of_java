package control_statement.loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int n= scanner.nextInt();
        int reminder,temp,pal=0;
        temp=n;
        while (temp!=0){
            reminder=temp%10;
            pal=pal*10+reminder;
            temp=temp/10;
        }
        if (n==pal){
            System.out.println("the given number is palindrome");
        }
        else {
            System.out.println("the given number is not palindrome");
        }
    }
}
