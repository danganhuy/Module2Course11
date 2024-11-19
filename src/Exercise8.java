import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.toLowerCase();

        LinkedList<Character> reverse = new LinkedList<Character>();
        Stack<Character> linear = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            reverse.add(c);
            linear.push(c);
        }

        boolean palindrome = true;
        while (!linear.isEmpty()) {
            if (reverse.pop() != linear.pop()) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
