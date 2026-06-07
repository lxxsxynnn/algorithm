import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] nums = new int[10];
        nums[0] = A;
        nums[1] = B;

        for(int i = 2; i < 10; i++){
            nums[i] = (nums[i - 2] + nums[i - 1]) % 10;
        }

        for(int num : nums) System.out.print(num + " ");
    }
}