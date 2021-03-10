import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserDataRead {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<User> userList = new ArrayList<User>();

        Scanner fileScan = new Scanner(new FileInputStream(new File("userdata.csv")));

        fileScan.nextLine();  // read/skip the column headers

        while(fileScan.hasNext()) {   // outer loop reads one file line
            String oneLine = fileScan.nextLine();
            //System.out.println(oneLine);  // this prints out each entry

            // Scan over single line:
            Scanner lineScan = new Scanner(oneLine);
            lineScan.useDelimiter(",");

            /*
            // This code prints out each bit of data on a separate line:
            while(lineScan.hasNext()) {   // inner loop parses that single line
                // "token" is a conventional term used for the bit between the delimiters.
                String token = lineScan.next();
                System.out.println(token);
            }
             */
            String firstName = lineScan.next();
            String lastName =  lineScan.next();
            String email = lineScan.next();
            String phone = lineScan.next();
            // IMPORTANT -  This only works with perfectly formed data, e.g. no empty spaces, etc in data.
            User user = new User(firstName, lastName, email, phone);
            userList.add(user);
        }
        fileScan.close();

        for(User u : userList) {
            System.out.println(u);
        }
    }
}
