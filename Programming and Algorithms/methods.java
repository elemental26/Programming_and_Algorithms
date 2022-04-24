
import java.util.Scanner;

public class methods {
    public static void main(String[] args) throws Exception {
    
      double x = Method1("Pick a Number");
      double y = Method1("Chose another Number");
      multiplication(x,y);

      Method();
    }


    public static double Method1(String prompt){
      System.out.println(prompt);
      Scanner keyboard = new Scanner (System.in);
      double value = keyboard.nextDouble();
      keyboard.close();
      return value;

    }

    public static void multiplication(double variable1, double variable2){
      double z = variable1 * variable2;
      System.out.println(z);

    }


    public static void Method(){
      String hello = ("Hello World");
      System.out.println(hello);
  
    }

  
  }
  