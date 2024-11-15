public class Exercise1 {
    // [Thực hành] Triển khai stack sử dụng lớp LinkedList trong thư viện java.util
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        MyStack<String> stack = new MyStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());

        System.out.println("\n2. Stack of Strings");
        MyStack<Integer> stack2 = new MyStack<>();
        stack2.push(5);
        stack2.push(4);
        stack2.push(3);
        stack2.push(2);
        stack2.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack2.size());
        System.out.print("2.2. Pop elements from stack:");
        while (!stack2.isEmpty()) {
            System.out.printf(" %d", stack2.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack2.size());
    }
}
