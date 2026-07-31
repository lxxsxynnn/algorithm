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

        for(Student s : list){
            System.out.println(s.name + " " + s.kor + " " + s.eng + " " + s.math);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student s){
        if(this.kor == s.kor){
            if(this.eng == s.eng){
                return s.math - this.math;
            }

            return s.eng - this.eng;
        }

        return s.kor - this.kor;
    }
}