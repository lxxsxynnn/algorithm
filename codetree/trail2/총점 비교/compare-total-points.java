import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Student s = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            list.add(s);
        }

        Collections.sort(list);

        for(Student s: list){
            System.out.println(s.name + " " + s.sc1 + " " + s.sc2 + " " + s.sc3);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int sc1, sc2, sc3;

    public Student(String name, int sc1, int sc2, int sc3){
        this.name = name;
        this.sc1 = sc1;
        this.sc2 = sc2;
        this.sc3 = sc3;
    }

    @Override
    public int compareTo(Student s){
        return (this.sc1 + this.sc2 + this.sc3) - (s.sc1 + s.sc2 + s.sc3);
    }
}