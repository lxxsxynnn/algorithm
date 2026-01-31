import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Object[][] members = new Object[N][2];

        for(int i = 0; i < N; i++){
            String info = br.readLine();
            StringTokenizer st = new StringTokenizer(info);
            members[i][0] = Integer.parseInt(st.nextToken());
            members[i][1] = st.nextToken();
        }

        //Arrays.sort 사용 + 형변환(Casting)
        Arrays.sort(members, (a, b) -> {
            return (int)a[0] - (int)b[0];
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(members[i][0]).append(" ").append(members[i][1]).append("\n");
        }
        System.out.print(sb);
    }
}