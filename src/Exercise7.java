import java.util.Scanner;
import java.util.Stack;

public class Exercise7 {
    // [Optional] [Bài tập] Chuyển đổi từ hệ thập phân sang hệ nhị phân
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = decimalToBinary(n);
        System.out.println("To binary: " + result);
    }

    public static String decimalToBinary(int n) {
        Stack<Character> result = new Stack<>();

        while (n != 0) {
            result.add(Character.forDigit(n % 2, 10));
            n = n / 2;
        }
        StringBuilder binary = new StringBuilder();
        while (!result.isEmpty()) {
            binary.append(result.pop());
        }
        return binary.toString();
    }
}
