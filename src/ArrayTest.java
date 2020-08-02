import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        char [] charList = {'a', 'b', 'c', 'd'};
        char [] charList2 = {'a', 'b', 'c', 'd'};
        long [] longNumbers = new long[3];
        longNumbers[0] = 1L;
        longNumbers[1] = 2L;
        longNumbers[2] = 3L;
        System.out.println(Arrays.toString(longNumbers));
        System.out.println(Arrays.equals(charList, charList2));
        System.out.println(Arrays.toString(charList));
    }
}
