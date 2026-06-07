import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[10];

        while(true){
            int score = sc.nextInt();

            if(score == 0) break;

            if(score > 9) scores[score / 10 - 1]++;
        }

        for(int i = scores.length - 1; i >= 0; i--){
            System.out.println((i + 1) * 10 + " - " + scores[i]);
        }
    }
}