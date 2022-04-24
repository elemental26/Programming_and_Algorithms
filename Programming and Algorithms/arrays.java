//Om Patel


import java.util.Scanner;
import java.io.*;

public class arrays {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner (new File("random.txt"));

        int numberOfLines = 0;

        while(file.hasNextLine()){
            numberOfLines = numberOfLines + 1;
            file.nextLine();

        }

        file = new Scanner (new File("random.txt"));

        String[] Lines = new String [numberOfLines];
        for (int i = 0; i < numberOfLines; i++){
            Lines[i] = file.nextLine();
            System.out.println(Lines[i]);
        }

    }
}
