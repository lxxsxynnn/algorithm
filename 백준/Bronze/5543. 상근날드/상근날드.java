import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 햄버거 3개 중 최솟값 찾기
        int minBurger = 2000;
        for (int i = 0; i < 3; i++) {
            int price = Integer.parseInt(br.readLine());
            minBurger = Math.min(minBurger, price);
        }

        // 음료 2개 중 최솟값 찾기
        int minDrink = 2000;
        for (int i = 0; i < 2; i++) {
            int price = Integer.parseInt(br.readLine());
            minDrink = Math.min(minDrink, price);
        }

        // (가장 싼 버거 + 가장 싼 음료) - 50원 할인
        System.out.println(minBurger + minDrink - 50);
    }
}