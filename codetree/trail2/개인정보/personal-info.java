import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            Student s = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
            list.add(s);
        }

        System.out.println("name");
        Collections.sort(list, Comparator.comparing(s -> s.name));
        for(Student s : list){
            System.out.println(s.name + " " + s.height + " " + s.weight);
        }

        System.out.println();

        System.out.println("height");
        Collections.sort(list, Comparator.comparingInt((Student s) -> s.height).reversed());
        for(Student s : list){
            System.out.println(s.name + " " + s.height + " " + s.weight);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int height;
    double weight;


    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student s){
        return s.height - this.height;
    }
}