import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            Person p = new Person(sc.next(), sc.nextInt(), sc.nextInt());
            list.add(p);
        }

        Collections.sort(list);

        for(Person p : list){
            System.out.println(p.toString());
        }
    }
}

class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person p){
        return this.height - p.height;
    }

    @Override
    public String toString(){
        return this.name + " " + this.height + " " + this.weight;
    }
}