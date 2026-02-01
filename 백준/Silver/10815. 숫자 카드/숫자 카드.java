import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> baseCards = new HashSet<>();

        String line1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(line1);

        for(int i = 0; i < N; i++) {
            baseCards.add(Integer.parseInt(st1.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        int[] havingCards = new int[M];

        String line2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(line2);

        for(int i = 0; i < M; i++) {
            havingCards[i] = Integer.parseInt(st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int card : havingCards) {
            sb.append((baseCards.contains(card) ? 1 : 0) + " ");
        }

        System.out.println(sb.toString().trim());
    }
}