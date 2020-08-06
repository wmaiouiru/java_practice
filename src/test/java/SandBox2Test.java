package test.java;

import main.java.SandBox2;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SandBox2Test {
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
    void testRunCheckSymmetricMatrix() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream(("         3\n" +
                "         0 1 2\n" +
                "         1 2 3\n" +
                "         2 3 4").getBytes());
        System.setIn(in);
        boolean result = SandBox2.runCheckSymmetricMatrix();
        System.setIn(sysInBackup);
        System.out.println("runCheckSymmetricMatrix. expected: true, result: "+ result);
        Assert.assertEquals(true, result);
    }
}