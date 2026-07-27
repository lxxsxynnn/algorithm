import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode  = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        
        Spy spy1 = new Spy(sCode, mPoint, time);
        System.out.println("secret code : " + spy1.sCode);
        System.out.println("meeting point : " + spy1.mPoint);
        System.out.println("time : " + spy1.time);
    }
}

class Spy{
    String sCode;
    char mPoint;
    int time;

    public Spy(String s, char m, int t){
        this.sCode = s;
        this.mPoint = m;
        this.time = t;
    }
}