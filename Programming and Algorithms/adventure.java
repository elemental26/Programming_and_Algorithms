/* Om Patel */

import java.util.Scanner;

public class adventure {
    public static void main(String[] args) throws Exception {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Welcome to the most basic adventure");

        System.out.println("Would you like to play? \n Type 1 to play or 2 to quit");
        int play = Keyboard.nextInt();
        

        if (play == 1){
            System.out.println("good luck");
            place1();
        } else if (play == 2){
            System.out.println("Good Choice");
        } else if (play != 1 || play != 2){
            System.out.println("You are a special human");
        }
        Keyboard.close();
        place2();
        place3();
        place4();
        place5();
        }
      
    public static void place1() throws Exception{
        System.out.println("You are in a forest");
        System.out.println("Press 1 to jump into a lake and press 2 to wander into an ominous cave");
        Scanner keyboard1 = new Scanner(System.in);
        double ans1 = keyboard1.nextDouble();
        keyboard1.close();

        if (ans1 == 1){
            return;
        } else if (ans1 == 2){
            System.out.println("You wandered into a cave and got eaten by a wolf \n Game Over");
        } else if (ans1 != 1 || ans1 != 2){
            System.out.println("Since you did not press 1 or 2, you get to restart");
        }
    }

    public static void place2() throws Exception{
        System.out.println("You jump into the lake and see a house in the middle of the lake");
        System.out.println("Press 3 to swim to the house and press 4 to find some food and set up a camping area");
        Scanner Keyboard = new Scanner(System.in);
        double ans2 = Keyboard.nextDouble();
        Keyboard.close();

        if (ans2 == 3){
            System.out.println("You should not randomly trespass onto other peoples property\n you got shot by the owner of the house and died \n Game Over");
        } else if (ans2 == 4){
            return;
        } else if (ans2 != 3 || ans2 != 4){
            System.out.println("Since you did not press 1 or 2, you get to restart");
        }
    }
    public static void place3() throws Exception{
        System.out.println("You see a tree with odd looking berries and another tree with apples");
        System.out.println("Press 1 to eat the berries and press 2 to eat the apples");
        Scanner keyboard3 = new Scanner(System.in);
        int ans1 = keyboard3.nextInt();
        keyboard3.close();

        if (ans1 == 1){
            System.out.println("You should not eat weird berries\n you got food poisoning and died of dysentery \n Game Over");
        } else if (ans1 == 2){
            return;
        } else if (ans1 != 1 || ans1 != 2){
            System.out.println("Since you did not press 1 or 2, you get to restart");
        }
    }
    public static void place4() throws Exception{
        System.out.println("After eating, you decide that you should get some wood for a fire. You see some wood layed out in a path that seems to be leading somewhere, but there is also a pile of chopped wood right next to you. ");
        System.out.println("Press 1 to follow the path of wood and press 2 to use the perfectly fine pile of wood");
        Scanner keyboard4 = new Scanner(System.in);
        int ans1 = keyboard4.nextInt();
        keyboard4.close();

        if (ans1 == 1){
            System.out.println("You should not follow mysterious paths\n you ran into a tribe of canibals and got eaten \n Game Over");
        } else if (ans1 == 2){
            return;
        } else if (ans1 != 1 || ans1 != 2){
            System.out.println("Since you did not press 1 or 2, you get to restart");
        }
    }
    public static void place5() throws Exception{
        System.out.println("You get a told by an entity that is floating in midair that you can go to a better place by eating a pill");
        System.out.println("Press 1 to eat the pill and press 2 to not eat the pill");
        Scanner keyboard5 = new Scanner(System.in);
        int ans1 = keyboard5.nextInt();
        keyboard5.close();

        if (ans1 == 1){
            System.out.println("You should not eat stuff given by strangers\n you got killed and your body was possessed by a demon \n Game Over");
        } else if (ans1 == 2){
            System.out.println("Good job, do not eat stuff given by strangers even if they are floating in midair. You were able to survive all of the trials.");
        } else if (ans1 != 1 || ans1 != 2){
            System.out.println("Since you did not press 1 or 2, you get to restart");
        }
    }
}
