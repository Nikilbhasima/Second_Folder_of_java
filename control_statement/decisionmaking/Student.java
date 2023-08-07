package control_statement.decisionmaking;

import java.util.Scanner;

public class Student {
    public void result() {
        Scanner scan = new Scanner(System.in);

        int total;
        System.out.println("enter the marks in math");
        int math = scan.nextInt();
        scan.nextLine();
        System.out.println("enter the marks in science");
        int science = scan.nextInt();
        scan.nextLine();
        System.out.println("enter the marks in social");
        int social = scan.nextInt();
        scan.nextLine();
        System.out.println("enter the marks in nepali");
        int nepali = scan.nextInt();
        scan.nextLine();
        total = math + nepali + social + science;
        float percentage = total / 4;
        if (percentage > 90) {
            System.out.println("A+");
        } else if (percentage < 90 && percentage >= 80) {
            System.out.println("A");
        } else if (percentage < 80 && percentage >= 70) {
            System.out.println("B+");
        } else if (percentage < 70 && percentage >= 60) {
            System.out.println("B");
        } else if (percentage < 60 && percentage >= 50) {
            System.out.println("C+");
        } else if (percentage < 50 && percentage >= 40) {
            System.out.println("c");
        } else {
            System.out.println("the student is fail");
        }
    }

}
