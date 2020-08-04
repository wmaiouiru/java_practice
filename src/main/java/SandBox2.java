package main.java;

import java.util.Scanner;

public class SandBox2 {
    public static void main(String[] args) {

    }

    public static void generateMatrix(int n){
        /**
         *  Example:
         *  0 1 2 3 4
         *  1 0 1 2 3
         *  2 1 0 1 2
         *  3 2 1 0 1
         *  4 3 2 1 0
         *
         *  Theory: The value in the entry is abs(row-col)
         *
         */
        int[][] matrix = new int[n][n];
        for (int i = 0; i<n; i++){
            for(int j=0; j<n;j++){
                matrix[i][j] = Math.abs(i-j);
            }
        }
        for (int i = 0; i<n; i++){
            for(int j=0; j<n;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void runCheckSymmetricMatrix(){
        Scanner scanner = new Scanner(System.in);
        int mSize = scanner.nextInt();
        int[][] matrix = getInputMatrix(mSize, scanner);
        checkSymmetricMatrix(mSize, matrix);
    }

    public static int[][] getInputMatrix(int mSize, Scanner scanner){
        int[][] matrix = new int[mSize][mSize];
        for(int i =0; i<mSize; i++){
            for(int j=0; j<mSize;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    public static void checkSymmetricMatrix(int mSize, int[][] matrix) {
        /**
         * Example:
         * 3
         * 0 1 2
         * 1 2 3
         * 2 3 4
         *
         */
        boolean isSymmetric = true;
        for (int i = 0; i<mSize; i++){
            for(int j = 0; j<mSize;j++){
                if (i == j){
                    continue;
                }
                if (matrix[i][j] != matrix[j][i]){
                    isSymmetric = false;
                }
            }
        }
        if (isSymmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
