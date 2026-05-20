import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        String season = "";

        if(M >= 3 && M <= 5) season = "Spring";
        if(M >= 6 && M <= 8) season = "Summer";
        if(M >= 9 && M <= 11) season = "Fall";
        if(M == 12 || M <= 2) season = "Winter";
        System.out.println(season);
    }
}