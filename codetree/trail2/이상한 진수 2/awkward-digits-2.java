import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        long max = -1;

        for(int i = 0; i < a.length(); i++){
            long sum = 0;

            for(int j = 0; j < a.length(); j++){
                int val;
                if(j == i) val = (a.charAt(j) == '0')? 1 : 0;
                else val = a.charAt(j) - '0';
                sum += (long) val * Math.pow(2, a.length() - 1 - j);
            }

            max = Math.max(max, sum);
        }
        
        System.out.print(max);
    }
}