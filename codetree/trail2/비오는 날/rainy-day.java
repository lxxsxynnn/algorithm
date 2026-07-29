import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Climate late = null;;

        for (int i = 0; i < n; i++) {
            Climate c = new Climate(sc.next(), sc.next(), sc.next());
            
            if((c.weather.equals("Rain")) && (late == null || c.date.compareTo(late.date) < 0)){
                late = c;
            }
        }

        System.out.println(late.date + " " + late.day + " " + late.weather);
    }
}

class Climate{
    String date;
    String day;
    String weather;

    public Climate(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}