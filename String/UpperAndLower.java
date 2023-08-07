package String;

import java.util.Scanner;

public class UpperAndLower {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER ANY stirng");
        String data=scanner.nextLine();
        System.out.println(data.length());
        System.out.println(data.toLowerCase());
        System.out.println(data.toUpperCase());
        String data1="apple";
        String data2="banana";
        String data3="apple";
        boolean value=data1.equals(data2);
        boolean value1=data1.equals(data3);
        System.out.println(value);
        System.out.println(value1);

    }
}
