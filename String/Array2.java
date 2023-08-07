package String;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter the size of array");
//        int size=scanner.nextInt();
        int[] numbers=new int[10];
        System.out.println("enter the numbers");

        for (int i=0;i<10;i++)
        {
            numbers[i]=scanner.nextInt();
        }
        for (int i=0;i<10;i++)
        {
            System.out.println(numbers[i]);
        }

    }
}
