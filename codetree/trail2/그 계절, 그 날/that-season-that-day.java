import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(whatSeason(y, m, d));
    }

    public static String whatSeason(int y, int m, int d){

        int[] cal = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(m < 1 || m > 12)
        return "-1";

        if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            cal[2] = 29;

        if(d < 1 || d > cal[m])
            return "-1";

        switch(m){
            case 12:
            case 1:
            case 2:
                return "Winter";

            case 3:
            case 4:
            case 5:
                return "Spring";

            case 6:
            case 7:
            case 8:
                return "Summer";

            default:
                return "Fall";
        }
    }
}