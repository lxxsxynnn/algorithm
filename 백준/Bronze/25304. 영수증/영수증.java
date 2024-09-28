import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int variable = sc.nextInt();

        int calculatedTotal = 0;

        for(int i = 1; i <= variable; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            calculatedTotal += price * quantity;
        }

        if (calculatedTotal == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}