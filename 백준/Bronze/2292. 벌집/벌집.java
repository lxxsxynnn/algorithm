import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /*
        * 1 -> 2 ~ 7(6개) -> 8 ~  19(12개) -> 20 ~ 37(18개) -> 38 ~ 61(24개)
        *
        * 레벨 1 : 1
        * 레벨 2 : 레벨 1 값 + 6
        * 레벨 3 : 레벨 2 값 + 6 * 2
        * 레벨 4 : 레벨 3 값 + 6 * 3
        *
        * 레벨 l : 레벨 l - 1값 + 6 * (l - 1)
        * */


        int level = 1;
        int limit = 1;

        while(N > limit) {
            limit += 6 * level;
            level++;
        }

        System.out.println(level);
    }
}