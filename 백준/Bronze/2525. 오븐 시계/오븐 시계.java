import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hr = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        min = hr * 60 + min;
        min = min + time;

        hr = (min / 60) % 24;
        min = min % 60;

        System.out.println(hr + " " + min);
    }
}
