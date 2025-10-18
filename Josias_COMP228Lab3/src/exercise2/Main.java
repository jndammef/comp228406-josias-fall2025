package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter game tester name: ");
        String name = scanner.nextLine();

        System.out.print("Enter tester type (1 for Full-Time, 2 for Part-Time): ");
        int type = scanner.nextInt();

        GameTester tester;

        if (type == 1) {
            tester = new FullTimeGameTester(name);
        } else if (type == 2) {
            System.out.print("Enter number of hours: ");
            int hours = scanner.nextInt();
            tester = new PartTimeGameTester(name, hours);
        } else {
            System.out.println("Invalid type!");
            scanner.close();
            return;
        }

        System.out.println("\nGame Tester Information:");
        System.out.println("Name: " + tester.getName());
        System.out.println("Status: " + (tester.isFullTime() ? "Full-Time" : "Part-Time")); //here we use our ternary operator to check if the tester is full-time or part-time
        System.out.println("Salary: $" + tester.determineSalary());

        scanner.close();
    }
}
