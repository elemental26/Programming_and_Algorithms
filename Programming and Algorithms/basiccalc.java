//OP J

import java.util.Scanner;
public class basiccalc {
    public static void main(String[] args) throws Exception {
 
        Scanner keyboard = new Scanner(System.in);

        System.out.println ("Welcome to Om's calculator, you can do the 4 basic functions using 2 numbers.");
        System.out.println ("Pick your first number");
        double x = keyboard.nextDouble();
        System.out.println ("Pick your second number");
        double y = keyboard.nextDouble();

        System.out.println ("Pick your function");

        System.out.println ("a) Addition");
        System.out.println ("b) Subtraction");
        System.out.println ("c) Multiplication");
        System.out.println ("d) Division");

        String choice = keyboard.next();

        if (choice.equals ("a") ){
            System.out.println ("Your answer is " + (x + y));
        } else if (choice.equals ("b") ){
            System.out.println ("Your answer is " + (x - y));
        } else if (choice.equals ("c") ){
            System.out.println ("Your answer is " + (x * y));
        } else if (choice.equals ("d") ){
            System.out.println ("Your answer is " + (x / y));
        } else {
            System.out.println("Stop being special and chose from the given options");
        }

keyboard.close();
    }
}