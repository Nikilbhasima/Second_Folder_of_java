package String;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=scanner.nextInt();
        int[] numbers=new int[size];
        System.out.println("enter the numbers");

        for (int i=0;i<size;i++)
        {
            numbers[i]=scanner.nextInt();
        }
        for (int i=0;i<=size;i++)
        {
            System.out.println(numbers[i]);
        }

    }
}
