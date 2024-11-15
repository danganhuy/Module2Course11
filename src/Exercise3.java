import java.util.Arrays;
import java.util.Stack;

public class Exercise3 {
    // [Bài tập] Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
    public static void main(String[] args) {
        char[] arr = new char[]{'3','r','a','s',';','M','/','Q','p','0','G',' '};
        System.out.println("Array before reversal: " + Arrays.toString(arr));

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.println("Array after reversal: " + Arrays.toString(arr));
    }
}
