package exercise_3;

import java.time.Year;

public class exercise3 {

    //I want to implement method overloading to calculate one's age
    // input Type:  String
    public static int calculateAge(String birthYear) {
        int year = Integer.parseInt(birthYear);
        return Year.now().getValue() - year;
    }

    //input type: integer
    public static int calculateAge(int yearOfBirth) {
        return Year.now().getValue() - yearOfBirth;
    }

    //input type: double
    public static double calculateAge(double yearOfBirth) {
        double age = Year.now().getValue() - yearOfBirth;
        return age;
    }

    public static void main(String[] args) {
        System.out.println("Age Calculator\n");

        System.out.println("Our program will select the right method base on the parameter select");

        String birthYearStr = "2000";
        int age1 = calculateAge(birthYearStr);
        System.out.println("Using the string method, Age is " + age1 + " years\n");

        int birthYearInt = 1995;
        int age2 = calculateAge(birthYearInt);
        System.out.println("Using the integer method, Age is " + age2 + " years\n");

        double birthYearDouble = 1998.5;
        double age3 = calculateAge(birthYearDouble);
        System.out.printf("Using the double method, " + "Age = %.1f years\n\n", age3);
    }
}