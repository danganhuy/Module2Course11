import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Exercise10 {
    // [Optional] [Bài tập] Tổ chức dữ liệu hợp lý - Demerging sử dụng Queue
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Toàn", true, LocalDate.of(1992, 7, 24)));
        people.add(new Person("Hòa", false, LocalDate.of(1997, 1, 15)));
        people.add(new Person("Uyên", false, LocalDate.of(1972, 2, 29)));
        people.add(new Person("An", true, LocalDate.of(1999, 8, 6)));
        people.add(new Person("Đạt", true, LocalDate.of(1952, 12, 6)));
        people.add(new Person("Linh", false, LocalDate.of(2000, 1, 17)));
        people.add(new Person("Vinh", true, LocalDate.of(1999, 1, 7)));
        people.add(new Person("Long", true, LocalDate.of(1984, 3, 8)));
        people.add(new Person("Huyệt", false, LocalDate.of(1987, 4, 30)));

        for (int i = 1; i < people.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (people.get(j - 1).getBirthday().isAfter(people.get(j).getBirthday())) {
                    Person temp = people.get(j);
                    people.set(j, people.get(j-1));
                    people.set(j-1, temp);
                }
            }
        }

        LinkedList<Person> man = new LinkedList<>();
        LinkedList<Person> woman = new LinkedList<>();

        for (Person person : people) {
            if (person.getGender()) {
                man.add(person);
            }
            else {
                woman.add(person);
            }
        }
    }
}
