import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> S = new HashSet<>();

        for (int i = 0; i < N; i++) {
            S.add(br.readLine());
        }

        int cnt = 0;
        for(int i = 0; i < M; i++){
            if(S.contains(br.readLine())) cnt++;
        };

        System.out.println(cnt);
    }
}