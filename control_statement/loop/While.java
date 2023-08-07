package control_statement.loop;

import java.util.Scanner;

public class While {
    public void loop(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name");
        String name= scan.nextLine();
        System.out.println("how many time do you want to print your name");
        int n= scan.nextInt();
        int i=1;
        while (i<=n){
            System.out.println("your name="+name);
            i++;
        }

    }
}
