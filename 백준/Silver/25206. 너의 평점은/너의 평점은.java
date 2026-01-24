import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalCredit = 0.0;
        double totalScore = 0.0;

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();
            double score = 0.0;

            if (grade.equals("P")) continue;

            switch (grade) {
                case "A+": score = 4.5; break;
                case "A0": score =  4.0; break;
                case "B+": score =  3.5; break;
                case "B0": score =  3.0; break;
                case "C+": score =  2.5; break;
                case "C0": score =  2.0; break;
                case "D+": score =  1.5; break;
                case "D0": score =  1.0; break;
                default: score += 0.0; break;
            }

            totalCredit += credit;
            totalScore += (score * credit);
        }

        System.out.println(totalScore / totalCredit);
    }
}
