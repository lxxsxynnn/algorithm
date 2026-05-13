import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int days = 0;
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(true){
            if(m1 == m2 && d1 == d2) break;
            
            if(m1 < m2 || (m1 == m2 && d1 < d2)){
                d1++;
                days++;

                if(d1 > months[m1]){
                    m1++;
                    d1 = 1;
                }
            } else {
                d1--;
                days--;

                if(d1 == 0){
                    m1--;
                    d1 = months[m1];
                }
            }
        }

        String[] dayOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println(dayOfWeek[(days % 7 + 7) % 7]);
    }
}