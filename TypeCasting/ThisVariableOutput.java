package TypeCasting;

import java.util.Scanner;

public class ThisVariableOutput {
    public static void main(String[] args){
        ThisVariable obj=new ThisVariable();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any value");
        int y= scanner.nextInt();
        obj.nikil(y);
    }
}
