import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserDataRead {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<User> userData = new ArrayList<User>();

        Scanner fileScan = new Scanner(new FileInputStream(new File("userdata.csv")));

        fileScan.nextLine();  // read/skip the column headers

        while(fileScan.hasNext()) {
            String oneLine = fileScan.nextLine();
            //System.out.println(oneLine);  // this prints out each entry
        }
        fileScan.close();
    }
}
