import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gen = sc.nextInt();
        int age = sc.nextInt();
        
        if(gen == 1){
            if(age >= 19) System.out.println("WOMAN");
            else System.out.println("GIRL");
        } else {
            if(age >= 19) System.out.println("MAN");
            else System.out.println("BOY");
        }
    }
}