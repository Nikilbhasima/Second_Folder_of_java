package control_statement.decisionmaking;

import java.util.Scanner;

public class Switch2 {
    public void mmm(){

        Scanner scan=new Scanner(System.in);
        int p;
        do {
        System.out.println("which task do you want to perform\n1)addition\n2)Multiplication table\n3)division\n4)modulus\n5)subtraction");
        int choice=scan.nextInt();

    switch (choice) {
        case 1:
            System.out.println("enter the first number");
            int a = scan.nextInt();
            System.out.println("enter the second number");
            int b = scan.nextInt();
            int sum = a + b;
            break;

        case 2:
            System.out.println("which number multiplication table do you want to print");
            int n = scan.nextInt();
            int i;
            for (i = 1; i <= 10; i++) {
                System.out.println(i +"x"+n+"="+i * n);
            }
            break;

        case 3:
            System.out.println("enter the dividian");
            int d = scan.nextInt();
            System.out.println("enter the divisor");
            int c = scan.nextInt();
            int div = d / c;
            System.out.println(div);
            break;

        case 4:
            System.out.println("enter the dividian");
            int e = scan.nextInt();
            System.out.println("enter the divisor");
            int f = scan.nextInt();
            int reminder = e / f;
            break;
        case 5:
            System.out.println("enter the first number");
            int h = scan.nextInt();
            System.out.println("enter the second number");
            int k = scan.nextInt();
            int sub = h - k;
            System.out.println(sub);
            break;
        default:
            System.out.println("enter the valid choice");
    }
    System.out.println("do you want to continue the code'1");
    p=scan.nextInt();
}while (p==1);
    }
}

