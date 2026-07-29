import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person last = null;

        for (int i = 0; i < n; i++) {
            Person p = new Person(sc.next(), sc.next(), sc.next());

            if (last == null || p.name.compareTo(last.name) > 0) {
                last = p;
            }
        }

        System.out.println("name " + last.name);
        System.out.println("addr " + last.addr);
        System.out.println("city " + last.city);
    }
}

class Person {
    String name;
    String addr;
    String city;

    public Person(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}