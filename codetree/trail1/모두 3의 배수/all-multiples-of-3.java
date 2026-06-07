import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isMultiples = true;

        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            if(num % 3 != 0) isMultiples = false;
        }

        System.out.println(isMultiples? 1 : 0);
    }
}