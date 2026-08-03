import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            Person p = new Person(sc.next(), sc.nextInt(), sc.nextInt());
            list.add(p);
        }
        Collections.sort(list);
        for(Person p: list){
            System.out.println(p.name + " " + p.h + " " + p.w);
        }
    }
}

class Person implements Comparable<Person>{
    String name;
    int h, w;

    public Person(String name, int h, int w){
        this.name = name;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Person p){
        if(this.h == p.h){
            return p.w - this.w;
        }
        return this.h - p.h;
    }
}