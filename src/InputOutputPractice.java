import java.io.*;
import java.util.Scanner;

public class InputOutputPractice {

    public static void main(String[] args)  {
        Scanner fileScan = null;
        try {
            // read in from the file
            fileScan = new Scanner(new FileInputStream("input_oneperline.txt"));

            // write to the file                                         // the "true" param will append text, instead of overriding`
            PrintWriter out = new PrintWriter(new FileOutputStream("output_alloneline.txt", true));

            // use hasNext in the signature...not hasNextLine
            // you can use hasNextLine, hasInt, etc within the loop
            while (fileScan.hasNext()) {
                String oneLine = fileScan.nextLine();
                //System.out.println(oneLine);   //this prints to the console.
                out.println(oneLine);  // this prints to the file.
            }
        } catch (FileNotFoundException ex){
            System.out.println("oops");
        }
        fileScan.close();
        //out.close();  // close the PrintWriter object so the work is saved.
        System.out.println("All done!");
    }
}
