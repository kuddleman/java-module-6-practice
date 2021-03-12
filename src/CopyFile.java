import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import static java.nio.file.StandardCopyOption.*;

public class CopyFile {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the file name to copy: ");
        String userFile = scan.nextLine();

        Path userInputPath = Paths.get(userFile);

        if(Files.exists(userInputPath)) {
            System.out.println("That is a valid file. Yup.");

            System.out.println("Enter the directory of where you want the file copied:");
            String userOutputDirectory = scan.nextLine();

            Path outputPath = Paths.get(userOutputDirectory);

            if(Files.isDirectory(outputPath)) {
                System.out.println("Yup, that is a directory");
                Files.copy(userInputPath, outputPath.resolve(userInputPath.getFileName()), REPLACE_EXISTING);
                                                      // REPLACE_EXISTING is an enum value
                                                      // import static java.nio.file.StandardCopyOption.*;
            } else {
                System.out.println("That is not a directory.");
            }
        } else {
            System.out.println("That is not a valid input file.");
        }
    }
}
