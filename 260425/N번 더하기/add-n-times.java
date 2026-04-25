import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int sum = A;

        for(int i = 0; i < N; i++){
            sum += N;
            System.out.println(sum);
        }
    }
}