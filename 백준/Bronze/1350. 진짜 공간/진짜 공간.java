import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] files = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            files[i] = Long.parseLong(st.nextToken());
        }

        long cluster = Long.parseLong(br.readLine());
        long storage = 0;

        for (int i = 0; i < N; i++) {
            long count = (files[i] + cluster - 1) / cluster;
            storage += count * cluster;
        }

        System.out.println(storage);
    }
}