import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] scores = new double[N];
        double sum = 0;

        for(int i = 0; i < N; i++){
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }

        double avg = sum / N;

        System.out.printf("%.1f\n", avg);
        System.out.println((avg >= 4.0)? "Perfect" : (avg >= 3.0)? "Good" : "Poor");
    }
}