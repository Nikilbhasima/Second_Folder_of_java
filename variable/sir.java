package variable;

import java.util.Scanner;

public class sir {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your name");
        String name= scanner.nextLine();
        System.out.println("enter your age");
        int age=scanner.nextInt();
        System.out.println();
        System.out.println("NAME=" +name);
        System.out.println("Age=" +age);
        scanner.nextLine();
    }
}
