import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        /*
        * 1: 1
        * 2: 2, 3
        * 3: 4, 5, 6
        * 4: 7, 8, 9, 10
        * */

        int[] nums = new int[1001];
        int count = 1;

        for (int i = 1; count <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (count > 1000) break;
                nums[count++] = i;
            }
        }

        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += nums[i];
        }

        System.out.println(sum);
    }
}