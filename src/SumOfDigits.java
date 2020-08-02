import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String n = scanner.nextLine();
        System.out.println(n.substring(0,1));
        System.out.println(Integer.parseInt(n.substring(0,1)) +
                           Integer.parseInt(n.substring(1,2))+
                           Integer.parseInt(n.substring(2,3))
        );
    }
}