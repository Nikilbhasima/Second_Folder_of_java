package variable;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
/*        String name = "nikil";
        String last = "bhasima";
        System.out.println(name + "from" + last);
        System.out.println(name.toLowerCase());
        System.out.println(last.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.contains("nikil"));
        System.out.println(name.charAt(3));
        System.out.println(name.endsWith("l"));
        System.out.println(name.indexOf("me"));*/
        System.out.println("enter you choice\n");
        int choice= scanner.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thurday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
        }

    }

}
