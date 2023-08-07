package control_statement.loop;

import javax.swing.plaf.IconUIResource;

public class ForLoop {
    public void stair(){
        int i,j;
        for(i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int p;
        for (p=1;p<=5;p++){
            System.out.println("nikil bhasima");
        }

        System.out.println("enter length and breath");
        System.out.println( ForLoop.sujan(8,8));

    }

    private static int sujan( int a,int b){
        int area=0;
        area=a*b;
        return area;
    }
}
