import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mathA = sc.nextInt();
        int engA = sc.nextInt();
        int mathB = sc.nextInt();
        int engB = sc.nextInt();

        String name = "";

        if(mathA == mathB){
            name = (engA > engB)? "A" : "B";
        } else {
            name = (mathA > mathB)? "A" : "B";
        }

        System.out.println(name);
    }
}