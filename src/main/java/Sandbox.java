package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        sizeOfParts();
        // runTernaryOperator();
        // SubStringRange();
        // CheckUnicodeTable();
        // CheckDiffNums();
        // CheckIncrements();
        // JoinByWhiteSpace();
    }

    public static void waitForInput(){
        // https://hyperskill.org/learn/step/3498
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            sum += elem;
        }

        System.out.println(sum);
    }
    public static void sizeOfParts(){
        // ref: https://hyperskill.org/learn/step/2194
        Scanner scanner = new Scanner(System.in);
        int inputSize = scanner.nextInt();
        int readyCount = 0;
        int toBeFixedCount = 0;
        int rejectCount = 0;
        for (int index = 0; index <= inputSize-1;index ++) {
            int partSize = scanner.nextInt();
            if (partSize  == 0){
                readyCount += 1;
            } else if (partSize == 1){
                toBeFixedCount += 1;
            } else if (partSize == -1){
                rejectCount += 1;
            }
        }
        System.out.println(readyCount+" "+toBeFixedCount+" "+rejectCount);
    }
    public static void runTernaryOperator(){
        // ref: https://hyperskill.org/learn/step/3506
        int num = 2;  // it's initialized by a value
        System.out.println(num % 2 == 0 ? "even" : "odd");
    }
    public static String chocolateBar(int n, int m, int k) {
        /**
         * Reference: https://hyperskill.org/learn/step/2170
         * n => length
         * m => height
         * k => segments
         *
         * return YES or NO
         */

        if (n * m > k && (k%n==0 || k%m == 0) ) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void SubStringRange(){
        /**
         * Sample Input 1:

         Java
         0 2
         Sample Output 1:

         Jav
         */
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(inputString.substring(start, end+1));
    }
    public static void CheckUnicodeTable(){
        // https://unicode-table.com/en/
        System.out.println("Ǘ");
        char chU = '\u0040'; // it represents '@'
        System.out.println(chU); // @

        char ch = 'e';
        System.out.println(ch);
        ch -= 'a';
        System.out.println(ch);
        ch++;
        System.out.println(ch);
        ch += 'b';
        System.out.println(ch);
        ch = 65;
        System.out.println(ch);

        char c = '1' + '3';
        System.out.println(c);
    }
    public static void JoinByWhiteSpace(){
        int[] arrayList = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrayList));
    }
    public static void CheckIncrements(){
        int a = 300;
        System.out.println("a:" + a);
        int b = a++;
        int c = --b;
        --b;
        --b;
        System.out.println("int a = 300; a:" + a);
        System.out.println("int b = a++; b:" + b);
        System.out.println("int c = --b; c:" + c);
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
