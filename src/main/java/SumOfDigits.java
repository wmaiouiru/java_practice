package main.java;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
    }
    public static void SumOfDigits (){
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String n = scanner.nextLine();
        System.out.println(n.substring(0,1));
        System.out.println(Integer.parseInt(n.substring(0,1)) +
                Integer.parseInt(n.substring(1,2))+
                Integer.parseInt(n.substring(2,3))
        );
    }
    public static void ReverseNumber(){
        System.out.println("start ReverseNumber");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        System.out.println("input: "+ n);
        int out = 0;
        out += Integer.parseInt(n.substring(0,1));
        out += Integer.parseInt(n.substring(1,2)) * 10;
        out += Integer.parseInt(n.substring(2,3)) * 100;
        System.out.println(out);
        System.out.println("end ReverseNumber");
    }
}