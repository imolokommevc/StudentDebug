package com.mycompany.studentdebug;

import java.util.Scanner;

public class StudentDebug {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = inp.nextLine();

        if (age >= 5)
            System.out.println("You can watch the movie")
        else
            System.out.println("Too young for entry");

        System.out.print("Enter ticket price: ");
        double price = inp.nextDouble();

        if (price > 100);
        {
            System.out.println("Premium ticket selected");
        }
        else
        {
            System.out.println("Standard ticket selected");
        }

        if (age >= 5 && age <= 12)
            System.out.println("Child");
        else if (age > 12 && age <= 18)
            System.out.println("Teen");
        else if (age > 18)
            System.out.println("Adult")
        else
            System.out.println("Invalid age");

        if (price > 150)
            if (age < 18)
                System.out.println("Free popcorn for kids!");
            else
                System.out.println("Free soda for adults!");
        else
            System.out.println("No free snacks");

        // Movie type selection
        System.out.print("Select movie type (1-3): ");
        int type = inp.nextInt();

        switch type {
            case 1:
                System.out.println("Action movie selected");
            case 2:
                System.out.println("Comedy movie selected");
            case 3:
                System.out.println("Horror movie selected");
            default:
                System.out.println("Invalid choice");
        }

    }
}
