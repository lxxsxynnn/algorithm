import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String part = sc.next();

        System.out.print(getIndex(str, part));
    }

    public static int getIndex(String str1, String str2){
        return str1.indexOf(str2);
    }
}