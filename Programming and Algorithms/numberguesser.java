//Om Patel

import java.util.Random;
import java.util.Scanner;
public class numberguesser {
    public static void main(String[] args) throws Exception {
  Random randy = new Random();
  
  System.out.println("Guess the number picked from 0 to 99");

  Scanner typed = new Scanner(System.in);
  int guess = typed.nextInt();
  
  int upperbound = 100;
  int rand1 = randy.nextInt(upperbound);
  

  if (guess == rand1){
    System.out.println("Nice job, you got the number!");
  } else {
    System.out.println("Not quite, try again");
  }
  typed.close();
    }
   
}
