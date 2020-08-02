package test.java;

import main.java.Sandbox;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SandboxTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After");
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