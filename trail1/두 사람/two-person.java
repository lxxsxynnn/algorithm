import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageA = sc.nextInt();
        String genA = sc.next();
        int ageB = sc.nextInt();
        String genB = sc.next();
        
        if((ageA >= 19 && genA.equals("M"))||(ageB >= 19 && genB.equals("M"))) System.out.println(1);
        else System.out.println(0);
    }
}