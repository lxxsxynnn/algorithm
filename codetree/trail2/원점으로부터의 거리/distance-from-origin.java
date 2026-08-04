import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Point p = new Point(sc.nextInt(), sc.nextInt(), i + 1);
            list.add(p);
        }
        Collections.sort(list);
        for(Point p : list){
            System.out.println(p.i);
        }
    }
}

class Point implements Comparable<Point>{
    int x, y, i;

    public Point(int x, int y, int i){
        this.x = x;
        this.y = y;
        this.i = i;
    }

    @Override
    public int compareTo(Point p){
        int d1 = Math.abs(this.x) + Math.abs(this.y);
        int d2 = Math.abs(p.x) + Math.abs(p.y);

        if(d1 != d2)
            return Integer.compare(d1, d2);

        return Integer.compare(this.i, p.i);
    }
}