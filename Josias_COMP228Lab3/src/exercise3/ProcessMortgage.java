package exercise3;

import java.util.Scanner;

public class ProcessMortgage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mortgage[] mortgages = new Mortgage[3];

        System.out.print("Enter current prime interest rate (as decimal, e.g., 0.01 for 1%): ");
        double primeRate = scanner.nextDouble();

        // Loop to create 3 mortgages
        for (int i = 0; i < 3; i++) {
            System.out.println("\n ***** Mortgage " + (i + 1) + " ******"); // This line will help the end user to distinguish between each mortgage

            System.out.print("Enter mortgage type (1 for Business, 2 for Personal): ");
            int type = scanner.nextInt();

            System.out.print("Enter mortgage unique ID: ");
            String mortgageId = scanner.next();

            scanner.nextLine();
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter mortgage amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter term (1, 3, or 5 years): ");
            int term = scanner.nextInt();

            // We use this conditional statement to create appropriate mortgage object
            if (type == 1) {
                mortgages[i] = new BusinessMortgage(mortgageId, customerName, amount, primeRate, term);
            } else if (type == 2) {
                mortgages[i] = new PersonalMortgage(mortgageId, customerName, amount, primeRate, term);
            } else {
                System.out.println("Invalid type! Personal Mortgage will be created for you.");
                mortgages[i] = new PersonalMortgage(mortgageId, customerName, amount, primeRate, term);
            }
        }

        // Display all mortgages
        System.out.println("\n========== LIST OF MORTGAGES =========="); //for a better visual output
        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("\nMortgage " + (i + 1) + ":");
            mortgages[i].getMortgageInfo();
            System.out.println("-----------------------------------"); // this line will separate all the mortgages
        }

        scanner.close();
    }
}
