import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = 0;
        String trash = ""; // to store invalid input

        // Array of month names
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        System.out.print("Enter your birth month (1-12): ");
        if (in.hasNextInt()) {
            // Safe to read the month as an integer
            month = in.nextInt();
            in.nextLine(); // clear the buffer

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + months[month - 1]);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            // Invalid input, read as a string
            trash = in.nextLine();
            System.out.println("You entered an incorrect month value: " + trash);
        }
    }
}
