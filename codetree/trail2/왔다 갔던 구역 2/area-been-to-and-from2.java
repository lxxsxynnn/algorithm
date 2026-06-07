import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int OFFSET = 1000;
        int[] area = new int[2001];

        int curr = OFFSET;

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();

            if (direction.equals("L")) {
                for (int i = curr - 1; i >= curr - x; i--) {
                    area[i]++;
                }
                curr -= x;

            } else {
                for (int i = curr; i < curr + x; i++) {
                    area[i]++;
                }
                curr += x;
            }
        }

        int count = 0;

        for (int a : area) {
            if (a >= 2) count++;
        }

        System.out.println(count);
    }
}