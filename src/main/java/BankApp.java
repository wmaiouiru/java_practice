package main.java;

import java.util.Random;

class Card {
    long pin;
    String cardNumber;
    long iin = 400000L;
    long accountIdentifier;
    long checkSum;
    public Card(){
        Random random = new Random();
        this.accountIdentifier = Math.abs(random.nextLong()%9999999999999999L);
        this.checkSum =  random.nextInt(9);
        this.cardNumber =  String.valueOf(this.iin) +
                String.valueOf(this.accountIdentifier) +
                String.valueOf(this.checkSum);
        this.pin = random.nextInt(9999);
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
        Card card = new Card();
        System.out.println(card.cardNumber);
        System.out.println(card.pin);
    }
    public static void printHome(){
        String line = "1. Create an account\n" +
                "2. Log into account\n" +
                "0. Exit\n";
        System.out.println(line);
    }
    public static void printLoggedIn(){
        String line = "1. Balance\n" +
                "2. Log out\n" +
                "0. Exit\n";
        System.out.println(line);
    }
}
