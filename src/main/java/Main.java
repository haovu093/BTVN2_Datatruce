import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String args[]) {
        ArrayList<Person> people = new ArrayList<Person>(Arrays.asList(
                new Person("Vinh", "Vietnam", 28),
                new Person("Lan", "Vietnam", 24),
                new Person("John", "USA", 27),
                new Person("Lee", "China", 67),
                new Person("Kim", "Korea", 22),
                new Person("Long", "Vietnam", 18),
                new Person("Jungho", "Korea", 19),
                new Person("Tian", "China", 20),
                new Person("Clara", "USA", 40),
                new Person("Mikura", "Japan", 27),
                new Person("Sony", "Japan", 29),
                new Person("Xiang", "China", 78),
                new Person("Peter", "France", 18),
                new Person("Haloy", "Malaysia", 20),
                new Person("Magie", "Malaysia", 32)
        ));
        System.out.println("1.1 Đếm số người theo từng quốc tịch in ra màn hình");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < people.size(); i++) {
            String nationality = people.get(i).nationality;

            Integer value = map.getOrDefault(nationality, 0);
            map.put(nationality, ++value);

        }
        for (String name : map.keySet()) {
            String key = name;
            String value = map.get(name).toString();
            System.out.println(key + " " + value);
        }


        System.out.println("\n1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình");

        List<Person> p1 = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).age >= 25) {
//                System.out.println(people.get(i));
                p1.add(people.get(i));
            }
        }
        Collections.sort(p1, new Comparator<Person>() {
            public int compare(Person t, Person t1) {
                int comp = t.getName().compareTo(t1.getName());
                if (comp != 0) {
                    return comp;
                }
                return t.getAge() - t1.getAge();
            }
        });
        for (Person p2 : p1) {
            System.out.println(p2);
        }


        System.out.println("\n1.4 In ra màn hình đánh giá tuổi mỗi người");
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).age < 20) {
                System.out.println(people.get(i) + " - " + "nổi loạn");
            } else if (people.get(i).age >= 20 && people.get(i).age <= 30) {
                System.out.println(people.get(i) + " - " + "Việc lam");
            } else if (people.get(i).age >= 31 && people.get(i).age <= 40) {
                System.out.println(people.get(i) + " - " + "Sự nghiêp");
            } else {
                System.out.println(people.get(i) + " - " +"Hưởng thụ");
            }

        }
    }

}
















