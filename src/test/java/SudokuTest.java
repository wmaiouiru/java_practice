package test.java;

import main.java.SandBox2;
import main.java.Sudoku;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SudokuTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        System.out.println("Before");
        System.out.println("setUpStreams");
        // System.setOut(new PrintStream(outContent));
        // System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void tearDown() {
        System.out.println("restoreStreams");
        // System.setOut(originalOut);
        // System.setErr(originalErr);
    }

    @Test
    void testValidateSudoku() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream(("3\n" +
                "5 8 9 6 7 4 2 1 3\n" +
                "7 4 3 1 8 2 9 5 6\n" +
                "1 2 6 9 5 3 8 7 4\n" +
                "9 3 5 4 2 1 7 6 8\n" +
                "4 1 2 8 6 7 3 9 5\n" +
                "6 7 8 3 9 5 1 4 2\n" +
                "8 6 4 2 1 9 5 3 7\n" +
                "3 9 7 5 4 8 6 2 1\n" +
                "2 5 1 7 3 6 4 8 9").getBytes());
        System.setIn(in);
        boolean result = Sudoku.validateSudoku();
        System.setIn(sysInBackup);
        System.out.println("validateSudoku. expected: true, result: "+ result);
        Assert.assertEquals(true, result);
    }
}