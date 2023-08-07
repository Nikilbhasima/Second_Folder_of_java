package String;

import java.util.Scanner;

public class Comparision {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("name the third planet of solar system");
        String planet=scanner.nextLine();
        planet=planet.toLowerCase();
//        if("earth".equals(planet)){
//            System.out.println("correct answer");
//        }
//        else
//            System.out.println("encorrect answer");
        System.out.println("earth".compareTo(planet));
    }
}
