package main.java;

public class BankApp {
    public static void main(String[] args) {
        /*
        * Create a while loop to get inputs
        * Randomly generate pin and card number
        *
        *
        * */
        printMenu();
    }
    public static void printMenu(){
        String line = "1. Create an account\n" +
                "2. Log into account\n" +
                "0. Exit\n";
        System.out.println(line);
    }
}
