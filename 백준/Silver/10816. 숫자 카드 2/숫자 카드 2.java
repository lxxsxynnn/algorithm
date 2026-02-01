import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> curr = new HashMap<>();

        String line1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(line1);

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st1.nextToken());
            curr.put(value, curr.getOrDefault(value, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        String line2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(line2);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int criteria = Integer.parseInt(st2.nextToken());
            sb.append(curr.getOrDefault(criteria, 0)).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
}