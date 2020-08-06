package main.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sudoku {
    public static void main(String[] args) {
        boolean result = validateSudoku();
        System.out.println(result);
    }

    public static boolean validateSudoku(){
        // reference: https://hyperskill.org/learn/step/3785
        /**
         * 1. Check rows have unqiue numbers 1 to N^2
         * 2. Check cols have unqiue numbers 1 to N^2
         * 3. Check small square have unqiue numbers 1 to N^2
         * 4. number in matrix equal or less than N^2
         *
         */

        Scanner scanner = new Scanner(System.in);
        int sudokuSize = scanner.nextInt();
        int[][] sudoku = Matrix.getSudoku(sudokuSize, scanner);
        // System.out.println(Arrays.deepToString(sudoku));

        boolean rowsAreValid = validateSudokuRows(sudokuSize, sudoku);
        if (!rowsAreValid){
            return false;
        }
        boolean colsAreValid = validateSudokuCols(sudokuSize, sudoku);
        if (!colsAreValid){
            return false;
        }

        boolean subSquaresAreValid = validateSudokuSubSquare(sudokuSize, sudoku);
        if (!subSquaresAreValid){
            return false;
        }
        return true;
    }

    public static boolean validateSudokuCols(int sudokuSize, int[][] sudoku){
        // iterating by cols
        int mSize = sudokuSize*sudokuSize;
        for(int i =0; i<mSize; i++) {
            Set<Integer> rowSet = new HashSet<>();
            for(int j=0; j<mSize;j++){
                int num = sudoku[i][j];
                if(num > sudokuSize * sudokuSize){
                    return false;
                }
                if(rowSet.contains(num)){
                    return false;
                } else {
                    rowSet.add(num);
                }
            }
        }
        return true;
    }
    public static boolean validateSudokuRows(int sudokuSize, int[][] sudoku){
        // iterating by rows
        int mSize = (int) Math.pow(sudokuSize, 2);
        for (int j =0; j <mSize; j++) {
            Set<Integer> rowSet = new HashSet<>();
            for(int i=0; i<mSize;i++) {
                if(rowSet.contains(sudoku[i][j])){
                    return false;
                } else {
                    rowSet.add(sudoku[i][j]);
                }
            }
        }
        return true;
    }
    public static boolean validateSudokuSubSquare(int sudokuSize, int[][] sudoku){
        // subSquare
        for (int x =0; x<sudokuSize; x++) {
            for (int y =0; y<sudokuSize; y++) {
                Set<Integer> rowSet = new HashSet<>();
                // row and col
                for (int j =0; j <sudokuSize; j++) {
                    for(int i=0; i<sudokuSize; i++) {
                        int num = sudoku[x*sudokuSize + i][y*sudokuSize + j];
                        if(rowSet.contains(num)) {
                            return false;
                        } else {
                            rowSet.add(num);
                        }
                    }
                }

            }
        }

        return true;
    }


}
