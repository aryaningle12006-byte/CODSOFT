package CurrencyConverter;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");

        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");
        System.out.println("5. INR to GBP");
        System.out.println("6. GBP to INR");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = amount / 83.0;
                System.out.printf("%.2f INR = %.2f USD%n", amount, result);
                break;

            case 2:
                result = amount * 83.0;
                System.out.printf("%.2f USD = %.2f INR%n", amount, result);
                break;

            case 3:
                result = amount / 90.0;
                System.out.printf("%.2f INR = %.2f EUR%n", amount, result);
                break;

            case 4:
                result = amount * 90.0;
                System.out.printf("%.2f EUR = %.2f INR%n", amount, result);
                break;

            case 5:
                result = amount / 105.0;
                System.out.printf("%.2f INR = %.2f GBP%n", amount, result);
                break;

            case 6:
                result = amount * 105.0;
                System.out.printf("%.2f GBP = %.2f INR%n", amount, result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
