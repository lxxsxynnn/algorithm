import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String result = "";

        if(c == 'S') result = "Superior";
        else if(c == 'A') result = "Excellent";
        else if(c == 'B') result = "Good";
        else if(c == 'C') result = "Usually";
        else if(c == 'D') result = "Effort";
        else result = "Failure";

        System.out.println(result);
    }
}