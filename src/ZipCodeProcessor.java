import java.util.Arrays;
import java.util.Scanner;

public class ZipCodeProcessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] zipCodes = new int[5];
        int validCodes = 0;
        int invalidCodes = 0;

        while(validCodes < zipCodes.length) {
            System.out.println("Enter a 5-digit zip code.");

            String zipCodeString = scan.nextLine();

            if(zipCodeString.length() == 5) {
                zipCodes[validCodes] = Integer.parseInt(zipCodeString);
                validCodes ++;
            } else {
                System.out.println("Invalid length");
                invalidCodes ++;
            }
        }
        System.out.println("You entered " + validCodes + " valid codes.");
        System.out.println("You entered " + invalidCodes + " invalid codes.");
        System.out.println(Arrays.toString(zipCodes));

    }
}
