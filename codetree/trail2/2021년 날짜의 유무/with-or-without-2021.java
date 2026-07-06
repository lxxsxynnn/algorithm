import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(isExist(m, d));
    }

    public static String isExist(int a, int b){
        int[] cal = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return (a <= 12 && cal[a] >= b)? "Yes" : "No";
    }
}