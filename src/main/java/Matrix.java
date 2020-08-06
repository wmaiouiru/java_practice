package main.java;

import java.util.Scanner;

public class Matrix {
    public static int[][] getSudoku(int sudokuSize, Scanner scanner){
        int mSize = sudokuSize*sudokuSize;
        int[][] matrix = new int[mSize][mSize];
        for(int i =0; i<mSize; i++){
            for(int j=0; j<mSize;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
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
    public static int[][] getMatrixFromScanner(int mSize, Scanner scanner){
        int[][] matrix = getInputMatrix(mSize, scanner);
        return matrix;
    }
}
