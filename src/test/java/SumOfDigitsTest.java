package test.java;

import main.java.SumOfDigits;
import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class SumOfDigitsTest {
    // reference: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    public void setUpStreams() {
        System.out.println("setUpStreams");
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    public void restoreStreams() {
        System.out.println("restoreStreams");
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @org.junit.jupiter.api.Test
    public void reverseNumber() {
        // TODO need to be able to invoke before and after
        setUpStreams();
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("320".getBytes());
        System.setIn(in);
        SumOfDigits.ReverseNumber();
        Assert.assertEquals("23", outContent.toString());
        // System.out.println("outContent:" + outContent);
        // System.out.println("errContent:" + errContent);
        System.setIn(sysInBackup);
        restoreStreams();
    }
}