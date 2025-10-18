package exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //we could have also used JOptionPane
        Insurance[] insuranceArray = new Insurance[100];
        int count = 0;

        boolean addInsurancePol = true; //this variable controls the loop. We set it to true to enter the loop at least once

        while (addInsurancePol) {
            System.out.print("Enter your insurance type (Health/Life): ");
            String type = scanner.next();

            System.out.print("Enter your monthly fee: ");
            double fee = scanner.nextDouble();

            Insurance insurance;

            if (type.equalsIgnoreCase("Health")) {
                insurance = new Health();
            } else if (type.equalsIgnoreCase("Life")) {
                insurance = new Life();
            } else {
                System.out.println("Invalid insurance type!");
                continue;
            }

            insurance.setInsuranceCost(fee);
            insuranceArray[count] = insurance;
            count++;

            System.out.print("Add another insurance? (yes/no): ");
            String response = scanner.next();
            addInsurancePol = response.equalsIgnoreCase("yes");
        }

        System.out.println("\nThis is your summary:");
        for (int i = 0; i < count; i++) {
            insuranceArray[i].displayInfo();
        }

        scanner.close();
    }
}
