import java.io.*;
import java.util.Random;


public class NumberFileOutput {
    public static void main(String[] args) {

        writeRandomNumbers();
    }
    public static void writeRandomNumbers()  {
        PrintWriter output = null;
        try {
            output = new PrintWriter(new BufferedWriter(new FileWriter("RandomNumbers.txt")));
            Random generator = new Random();
            for ( int i = 0; i < 100; i++) {
                int number = generator.nextInt(501);
                output.print(number + " ");
            }

        } catch(IOException ex) {

        } finally {
            if(output != null) {
                output.close();
            }

        }
        System.out.println("Done");
    }
}
