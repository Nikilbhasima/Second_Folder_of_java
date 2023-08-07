package statickeyword;

import java.util.Scanner;

public class AreaOutput {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        int l=scanner.nextInt();
        System.out.println("enter the breath of rectangle");
        int b= scanner.nextInt();
        System.out.println(AreaOfRectangle.area(l,b)+" "+"meter per square");

    }
}
