package main.java;

import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        CheckDiffNums();

        int [] numList = {1, 2, 3};
    }

    public static void CheckDiffNums(){
        /** Write a program that reads three numbers and checks that they all are different, i.e. not equal to one another.
         *
         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a!=b && b!=c && a!=c);
    }

    public static boolean CheckOnePositive(int [] numList){
        int positiveCount = 0;
        for(int num: numList){
            if (num > 0){
                positiveCount += 1;
            }
        }
        if (positiveCount == 1) {
            return true;
        } else {
            return false;
        }
    }
}
