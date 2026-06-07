import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        String result = "";

        if(A >= 1.0 && B >= 1.0) result = "High";
        else if(A >= 0.5 && B >= 0.5) result = "Middle";
        else result = "Low";

        System.out.println(result);
    }
}