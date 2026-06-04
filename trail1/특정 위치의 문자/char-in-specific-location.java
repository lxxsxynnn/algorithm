import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] letters = {'L', 'E', 'B', 'R', 'O', 'S'};

        char c = sc.next().charAt(0);

        for(int i = 0; i < 6; i++){
            if(c == letters[i]) {
                System.out.print(i);
                return;
            }
        }

        System.out.print("None");
    }
}