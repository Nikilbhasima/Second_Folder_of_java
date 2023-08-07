package String;

import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE six=ze of array");
        int size=scanner.nextInt();
        int temp;
        int[] numbers=new int[size];
        for (int i=0;i<size;i++)
        {
            numbers[i]=scanner.nextInt();

        }
        for (int i=0;i<size;i++)
        {
            System.out.print(numbers[i]+"\t");

        }
        System.out.println();
        System.out.println("print the entered number in ascending order");
        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                if(numbers[i]<numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;

                }
            }
        }
        for (int i=0;i<size;i++){
            System.out.print(numbers[i]+"\t");
        }
    }
}
