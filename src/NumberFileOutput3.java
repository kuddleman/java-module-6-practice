import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class NumberFileOutput3 {

    // USE TRY WITH RESOURCES
    public static void main(String[] args) {
        writeRandomNumbers();
    }
    public static void writeRandomNumbers() {
        try (PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("RandomNumbers.txt")))) {
            Random generator = new Random();
            for ( int i = 0; i < 100; i++) {
                int number = generator.nextInt(501);
                        output.print(number + " ");
            }

        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Done!");
    }
      /// resource is AUTOMATICALLY closed.  No finally block necessary.
}
