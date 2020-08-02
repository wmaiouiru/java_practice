import java.util.Scanner;

public class InputHelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter First Word");
        Scanner scanner = new Scanner(System.in);
        // System.out.println(scanner.next());
        System.out.println("Enter First Line");
        System.out.println(scanner.nextLine());
    }
}