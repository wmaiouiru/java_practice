package main.java;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class Card {
    long pin;
    String cardNumber;
    long iin = 400000L;
    long accountIdentifier;
    long checkSum;
    public Card(){
        Random random = new Random();
        this.accountIdentifier = Math.abs(random.nextLong()%999999999L);
        this.checkSum = 5; // random.nextInt(9);
        this.cardNumber =  String.valueOf(this.iin) +
                String.valueOf(this.accountIdentifier) +
                String.valueOf(this.checkSum);
        this.pin = random.nextInt(9999);
    }

    public void printCreatedCard(){
        System.out.println("Your card has been created");
        System.out.println("Your card number:");
        System.out.println(this.cardNumber);
        System.out.println("Your card PIN:");
        System.out.println(this.pin);
    }
}


public class BankApp {
    public static void main(String[] args) {
        // Ref: https://hyperskill.org/projects/93/stages/515/implement
        /*
        * Create a while loop to get inputs
        * Randomly generate pin and card number
        *
        *
        * */
        // printMenu();
        boolean loggedIn = false;
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Card> hm = new HashMap<String, Card>();
        while (true){
            if (loggedIn){
                printLoggedIn();
            } else {
                printHome();
            }
            int option = scanner.nextInt();
            if (loggedIn){
                if (option == 0){
                    break;
                }
                if (option == 1){
                    System.out.println("Balance: 0");
                }
                if (option == 2){
                    System.out.println("You have successfully logged out!");
                    loggedIn = false;
                }
            } else {
                if (option == 0){
                    break;
                } else if (option == 1) {
                    Card card = new Card();
                    card.printCreatedCard();
                    hm.put(card.cardNumber, card);
                } else if (option == 2) {
                    loggedIn = login(scanner, hm);
                    if(loggedIn){
                        System.out.println("You have successfully logged in!");
                    } else {
                        System.out.println("Wrong card number or PIN!");
                    }
                }
            }
        }
        System.out.println("Bye!\n");
    }
    public static boolean login(Scanner scanner, HashMap<String, Card> hm){
        boolean loggedIn = false;
        System.out.println("Enter your card number:");
        // System.out.print(">");
        String cardNumber = scanner.next();
        System.out.println("Enter your PIN:");
        // System.out.print(">");
        int pin = scanner.nextInt();
        if (hm.containsKey(cardNumber)){
            Card card = hm.get(cardNumber);
            if (card.pin == pin) {
                loggedIn = true;
            }
        }
        return loggedIn;
    }
    public static void printHome(){
        String line = "1. Create an account\n" +
                "2. Log into account\n" +
                "0. Exit";
        System.out.println(line);
        // System.out.print(">");
    }
    public static void printLoggedIn(){
        String line = "1. Balance\n" +
                "2. Log out\n" +
                "0. Exit";
        System.out.println(line);
        // System.out.print(">");
    }
}
