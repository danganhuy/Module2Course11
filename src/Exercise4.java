import java.util.Scanner;
import java.util.TreeMap;

public class Exercise4 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Apple", 1);
        map.put("Hello", 4);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Run", 1);
        map.put("Gift", 5);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter word: ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            if (map.containsKey(input)) {
                int value = map.get(input) + 1;
                map.put(input, value);
            } else {
                map.put(input, 1);
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(map);
    }
}
