import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Use a nested if statement to check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Use a switch statement to check if the number is in a specific range
        switch (number) {
            case 1:
                System.out.println("The number is 1.");
                break;
            case 2:
                System.out.println("The number is 2.");
                break;
            case 3:
                System.out.println("The number is 3.");
                break;
            default:
                System.out.println("The number is not in the range 1-3.");
                break;
        }
    }
}