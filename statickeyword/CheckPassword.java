package statickeyword;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE username");
        String username= scanner.nextLine();
        System.out.println("Enter the password");
        String password= scanner.nextLine();
        int result=Enterpassword.check(username,password);
        if(result==1){
            System.out.println("login successful");
        }
        else {
            System.out.println("login fail");
        }

        int k,l;
        System.out.println("enter the length and height of triangle");
        k=scanner.nextInt();
        l=scanner.nextInt();
        float triangle=Enterpassword.areaOfTriangle(k,l);
        System.out.println("area of triangle="+triangle);
    }
}
