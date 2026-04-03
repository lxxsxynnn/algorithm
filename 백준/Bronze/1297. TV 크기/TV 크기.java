import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double D = Double.parseDouble(st.nextToken());
        double H = Double.parseDouble(st.nextToken());
        double W = Double.parseDouble(st.nextToken());

        /*
        * D^2 = (n * H) ^ 2 + (n * W) ^ 2
        *     = n^2 * (H^2 + W^2)
        * n^2 = D^2 / (H^2 + W^2)
        * */

        double n = Math.sqrt((D * D) / (H * H + W * W));

        int realH = (int) (H * n);
        int realW = (int) (W * n);

        System.out.println(realH + " " + realW);
    }
}