//MADLIBS Assignment

import java.util.Scanner;
public class Madlibs {
    public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);

System.out.println("Name a type of car");
String car = keyboard.nextLine();

System.out.println("What is your favorite animal?");
String animal = keyboard.nextLine();

System.out.println("What can you do with a car?");
String action1 = keyboard.nextLine();

System.out.println("What word starts with be and ends with cause?");
String verb2 = keyboard.nextLine();

System.out.println("What is the opposite of heaven?");
String adj1 = keyboard.nextLine();

System.out.println("Albert Einstein can be described as ____.");
String adj2 = keyboard.nextLine();

System.out.println("The "+animal+" cannot "+action1+" a "+car+" just "+verb2+" it's "+adj2+"If it did, it could make the road "+ adj1+"ish.");

        keyboard.close();

    }
}
