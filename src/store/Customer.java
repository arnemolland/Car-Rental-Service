package store;

import java.util.Scanner;

public class Customer {
    String firstName = null;
    String lastName = null;
    String customerAddress = null;
    int customerPhone = 0;

    // Constructor method to create a customer
    public Customer(String firstName, String lastName, String customerAddress, int customerPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
    }

    // Method for registering a user
    /*
     * public void userRegistration() { System.out.
     * println("Please fill out your name, a address and you phone number"); Scanner
     * scanner = new Scanner(System.in); scan.nextLine(); String s =
     * scan.nextLine(); scan.close(); }
     */
}
