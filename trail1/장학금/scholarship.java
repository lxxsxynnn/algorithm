import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int fin = sc.nextInt();
        int sch = 0;

        if(mid < 90) sch = 0;
        else if(fin >= 95) sch = 100000;
        else if(fin >= 90) sch = 50000;

        System.out.println(sch);
    }
}