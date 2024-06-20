import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String affiliation = ""; // to store party affiliation

        System.out.print("Enter your party affiliation (D for Democrat, R for Republican, I for Independent): ");
        affiliation = in.nextLine().trim().toUpperCase(); // Read the input and convert it to uppercase

        if (affiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (affiliation.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (affiliation.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}
