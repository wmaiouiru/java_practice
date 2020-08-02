import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ChefForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Stack<String> st = new Stack();
        st.push(scanner.nextLine());
        st.push(scanner.nextLine());
        st.push(scanner.nextLine());
        while (st.size() > 0){
            System.out.println(st.pop());
        }
    }
    public static void printQueue(){
        Scanner scanner = new Scanner(System.in);
        Queue queueB = new PriorityQueue();
        queueB.add(scanner.nextLine());
        queueB.add(scanner.nextLine());
        queueB.add(scanner.nextLine());
        queueB.add(scanner.nextLine());
        // queueB.size();
        while (queueB.size() > 0){
            System.out.println(queueB.poll());
        }
    }
    public static void printChefForm() {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("The form for "+firstName+" is completed. We will contact you if we need a chef that cooks fusion dishes.");
    }
}
