package test.java;

import main.java.Sandbox;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SandboxTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        System.out.println("Before");
        System.out.println("setUpStreams");
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void tearDown() {
        System.out.println("restoreStreams");
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    @Test
    void testCountGrades(){
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream(("13\n" +
                "2\n" +
                "5\n" +
                "5\n" +
                "5\n" +
                "5\n" +
                "3\n" +
                "2\n" +
                "4\n" +
                "3\n" +
                "3\n" +
                "3\n" +
                "2\n" +
                "3").getBytes());
        System.setIn(in);
        HashMap<Integer, Integer> hm = Sandbox.countGrades();
        System.setIn(sysInBackup);
        Assert.assertEquals(5, 5);
    }
    @Test
    void longestAscStrictSeq(){
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("10\n 1 2 4 1 2 3 5 7 4 3".getBytes());
        System.setIn(in);
        int maxCount = Sandbox.longestAscStrictSeq();
        System.setIn(sysInBackup);
        Assert.assertEquals(5, maxCount);
    }
    @Test
    void longestAscStrictSeq1(){
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("6\n 1 1 2 3 4 5".getBytes());
        System.setIn(in);
        int maxCount = Sandbox.longestAscStrictSeq();
        System.setIn(sysInBackup);
        Assert.assertEquals(5, maxCount);
    }

    @Test
    void longestAscStrictSeq2(){
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("2\n 1 2".getBytes());
        System.setIn(in);
        int maxCount = Sandbox.longestAscStrictSeq();
        System.setIn(sysInBackup);
        Assert.assertEquals(2, maxCount);
    }

    @Test
    void testCyclicShifting(){
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("5\n 1 2 3 4 5".getBytes());
        System.setIn(in);
        int[] array = Sandbox.cyclicShifting();
        System.setIn(sysInBackup);
        String result = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(result);
        int[] expectedArray = {5,1,2,3,4};
        Assert.assertArrayEquals(expectedArray, array);
    }
    @Test
    void testCountNumInArray(){
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("6\n 1 2 3 4 2 1\n 2".getBytes());
        System.setIn(in);
        int count = Sandbox.countNumInArray();
        System.setIn(sysInBackup);
        Assert.assertEquals(2, count);
    }
    @Test
    void testCheckInOrder1(){
        // ref: https://hyperskill.org/learn/step/2734
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("1 1 1 1 2 3 0".getBytes());
        System.setIn(in);
        boolean inOrder = Sandbox.checkInOrder();
        System.setIn(sysInBackup);
        Assert.assertEquals(true, inOrder);
    }
    @Test
    void testCheckInOrder2(){
        // ref: https://hyperskill.org/learn/step/2734
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("4 4 1 2 3 0".getBytes());
        System.setIn(in);
        boolean inOrder = Sandbox.checkInOrder();
        System.setIn(sysInBackup);
        Assert.assertEquals(false, inOrder);
    }
    @Test
    void testCheckInOrder3(){
        // ref: https://hyperskill.org/learn/step/2734
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("1 2 5 5 2 3 0".getBytes());
        System.setIn(in);
        boolean inOrder = Sandbox.checkInOrder();
        System.setIn(sysInBackup);
        Assert.assertEquals(false, inOrder);
    }

    @Test
    void testCalculateCompoundGrowthYear(){
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("1 100 8".getBytes());
        System.setIn(in);
        int yearCount = Sandbox.calculateCompoundGrowthYear();
        System.setIn(sysInBackup);
        Assert.assertEquals(3, yearCount);
    }

    @Test
    void checkOnePositiveTrue() {
        int[] n = {-1, -1, 2};
        boolean result = Sandbox.CheckOnePositive(n);
        Assert.assertEquals(result, true);
    }
    @Test
    void checkOnePositiveFalse() {
        int[] n = {-1, -1, 2, 2};
        boolean result = Sandbox.CheckOnePositive(n);
        Assert.assertEquals(result, false);
    }

    @Test
    void chocolateBar1() {
        String output = Sandbox.chocolateBar(4, 2, 6);
        Assert.assertEquals(output, "YES");
    }
    @Test
    void chocolateBar2() {
        String output = Sandbox.chocolateBar(2, 10, 7);
        Assert.assertEquals(output, "NO");
    }
    @Test
    void chocolateBar3() {
        String output = Sandbox.chocolateBar(7, 4, 21);
        Assert.assertEquals(output, "YES");
    }
}