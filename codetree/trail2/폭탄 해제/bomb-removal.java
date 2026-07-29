import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bomb b = new Bomb(sc.next(), sc.next().charAt(0), sc.nextInt());
        System.out.println("code : " + b.code);
        System.out.println("color : " + b.color);
        System.out.println("second : " + b.second);
    }
}

class Bomb{
    String code;
    char color;
    int second;

    public Bomb(String code, char color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}