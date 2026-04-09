import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int scenario = 1;

        while (true) {
            String line = br.readLine();
            if (line == null || line.equals("0 0")) break;

            StringTokenizer st = new StringTokenizer(line);
            int o = Integer.parseInt(st.nextToken()); // 적정 체중
            int w = Integer.parseInt(st.nextToken()); // 실제 체중

            boolean isDead = false;

            while (true) {
                st = new StringTokenizer(br.readLine());
                String cmd = st.nextToken();
                int val = Integer.parseInt(st.nextToken());

                if (cmd.equals("#") && val == 0) break;

                if (!isDead) {
                    if (cmd.equals("E")) w -= val;
                    else if (cmd.equals("F")) w += val;
                    
                    if (w <= 0) isDead = true;
                }
            }

            System.out.print(scenario + " ");
            if (isDead) {
                System.out.println("RIP");
            } else if (w > o / 2.0 && w < o * 2) {
                System.out.println(":-)");
            } else {
                System.out.println(":-(");
            }
            scenario++;
        }
    }
}