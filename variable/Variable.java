package variable;

import java.util.Scanner;

public class Variable {
    int number=4;
    static String name="virinchi";
    static  String name1="Rohan";
    public void getVariable (){
        int  a=50; //local variable
        System.out.println(a);
        System.out.println("nikil bhasima");

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the your name");
        String name=scan.nextLine();
        System.out.println(name);

    }
}
