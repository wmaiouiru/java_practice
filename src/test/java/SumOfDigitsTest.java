package test.java;

import main.java.SumOfDigits;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class SumOfDigitsTest {

    @org.junit.jupiter.api.Test
    void reverseNumber() {
        InputStream inputStream = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("320".getBytes());
        System.setIn(in);
        SumOfDigits.ReverseNumber();
    }
}