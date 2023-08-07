package variable;

import java.util.Scanner;

public class Testing {
    int number =20;
    byte number2=1;
    long number3=224208940;
    float number4=2.00555f;
    double number5=9.333333333333333;//all the above variable are instance variable
    static int numberA=20;
    static String name="salman khan";
    static char character='f';
    public void nikil(){
        System.out.println("my aim is to become police");
        System.out.println("my name is nikil bhasima.i live in madhyapur thimi pobuu");
        numberA+=1;
        System.out.println("statice variable="+numberA);
        System.out.println('a');
        int number1=10;
        float number6=2;
        short number7=45;
        long number8=11111;
        double number9=5333333333.55555555555555555555555;
        System.out.println("integer="+number1);
        System.out.println("decimal=+"+number6);
        System.out.println("short variable="+number7);
        System.out.println("long variable="+number8);
        System.out.println("double variable="+number9);
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the your name");
        String name=scan.nextLine();

    }
}
