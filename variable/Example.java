package variable;
import java.util.Scanner;

public class Example {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Hello, " + name + "! You are " + age + " years old.");

            scanner.close();
        }
    }

