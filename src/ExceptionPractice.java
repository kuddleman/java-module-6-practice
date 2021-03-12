import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter a positive number: ");
            int number = Integer.parseInt(scan.nextLine());

            if (number > 0) {
                System.out.println("Yes!");
            } else {
                System.out.println("Sorry, that number is not positive.");
            }
        } catch(NumberFormatException ex) {
            System.out.println("Sorry, that is not a number.");
        }
    }
}
