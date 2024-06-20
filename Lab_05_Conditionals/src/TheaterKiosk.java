import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;

        System.out.print("Please enter your age: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine(); // clear the buffer

            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid age.");
        }
    }
}
