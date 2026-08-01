import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            Student s = new Student(sc.nextInt(), sc.nextInt(), i + 1);
            list.add(s);
        }

        Collections.sort(list);

        for(Student s : list){
            System.out.println(s.h + " " + s.w + " " + s.i);
        }
    }
}

class Student implements Comparable<Student> {
    int h, w, i;


    public Student(int h, int w, int i){
        this.h = h;
        this.w = w;
        this.i = i;
    }

    @Override
    public int compareTo(Student s){
        if(this.h == s.h){
            if(this.w == s.w){
                return this.i - s.i;
            }

            return s.w - this.w;
        }

        return s.h - this.h;
    }
}