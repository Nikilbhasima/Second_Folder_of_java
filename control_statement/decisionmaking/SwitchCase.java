package control_statement.decisionmaking;

import java.util.Scanner;

public class SwitchCase {
    public void choose(){
        int choice;
        Scanner scan=new Scanner(System.in);
        System.out.println("which task do you want to perform");
        int day= scan.nextInt();
        switch (day){
            case 1:
                System.out.println("chest day i)front ii)middle iii)back");
                break;
            case 2:
                System.out.println("back day");
                break;
            case 3:
                System.out.println("biceps day");
                break;
            case 4:
                System.out.println("triceps day");
                break;
            case 5:
                System.out.println("shoulder day");
                break;
            case 6:
                System.out.println("leg day");
                break;
            default:
                System.out.println("enter the valid input");
        }
    }
}
