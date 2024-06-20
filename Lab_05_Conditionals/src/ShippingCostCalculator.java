import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        String trash = ""; // to store invalid input

        System.out.print("Enter the price of the item: ");
        if (in.hasNextDouble()) {
            // Safe to read the item price as a double
            itemPrice = in.nextDouble();
            in.nextLine(); // clear the buffer

            double shippingCost;
            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * 0.02;
            }

            double totalPrice = itemPrice + shippingCost;

            System.out.println("Shipping cost: $" + shippingCost);
            System.out.println("Total price: $" + totalPrice);
        } else {
            // Invalid input, read as a string
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Run the program again and enter a valid price.");
        }
    }
}
