import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileAppendReplace {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the file name with the data:");
        String userFile = scan.nextLine();

        Path userInputPath = Paths.get(userFile);

        if (Files.exists(userInputPath)) {
            Scanner fileScan = new Scanner(userInputPath);
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                Scanner lineScan = new Scanner(line);
                lineScan.useDelimiter(",");
                String fileName = lineScan.next();
                boolean append = Boolean.parseBoolean(lineScan.next());
                List<String> newTextList = new ArrayList<String>();
                while (lineScan.hasNext()) {
                    newTextList.add(lineScan.next());
                }
                PrintWriter out = new PrintWriter(new FileOutputStream(fileName, append));

                for (String text : newTextList) {
                    out.println(text);
                }
                out.close();
            }
        }

    }
}
