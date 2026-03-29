import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int Y = 0;
        int M = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(N-- > 0){
            int time = Integer.parseInt(st.nextToken());

            Y += 10 * ((time / 30) + 1);
            M += 15 * ((time / 60) + 1);
        }

        if(Y < M) sb.append("Y " + Y);
        else if(Y == M) sb.append("Y M " + Y);
        else sb.append("M " + M);

        System.out.println(sb);
    }
}