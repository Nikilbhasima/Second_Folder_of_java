package control_statement.loop;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int n= scanner.nextInt();
        int temp,reminder,reverse=0;
        temp=n;
        while (temp!=0){
            reminder=temp%10;
            reverse=reverse+reminder*reminder*reminder;
            temp=temp/10;
        }
        if (n==reverse)
        {
            System.out.println("the given number is armstrong");
        }
        else {
            System.out.println("the given number is not armstrong");
        }
    }
}
