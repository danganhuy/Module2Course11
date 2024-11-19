import java.util.Scanner;
import java.util.Stack;

public class Exercise9 {
    // [Optional] [Bài tập] Kiểm tra dấu ngoặc trong biểu thức sử dụng Stack
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String expression = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean flag = false;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                if (stack.isEmpty()) {
                    flag = true;
                    break;
                }
                else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            flag = true;
        }
        if (!flag) {
            System.out.println("Good enough");
        }
        else {
            System.out.println("Error");
        }
    }
}
