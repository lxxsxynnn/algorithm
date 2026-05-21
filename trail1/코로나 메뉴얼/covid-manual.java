import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char symA = sc.next().charAt(0);
        int temA = sc.nextInt();

        char symB = sc.next().charAt(0);
        int temB = sc.nextInt();

        char symC = sc.next().charAt(0);
        int temC = sc.nextInt();
        
        int[] symCnt = new int[4];

        symCnt[status(symA, temA) - 'A']++;
        symCnt[status(symB, temB) - 'A']++;
        symCnt[status(symC, temC) - 'A']++;

        System.out.println((symCnt[0]>= 2)? 'E' : 'N');
    }

    static char status(char sym, int tem){
        if(sym == 'Y'){
            if(tem >= 37) return 'A';
            else return 'C';
        } else {
            if(tem >= 37) return 'B';
            else return 'D';
        }
    }
}