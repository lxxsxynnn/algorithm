import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        String N = br.readLine();

        int decimal = 0;

        for (int i = 0; i < N.length(); i++) {
            decimal = decimal * A + (N.charAt(i) - '0');
        }

        StringBuilder sb = new StringBuilder();

        while (decimal > 0) {
            sb.append(decimal % B);
            decimal /= B;
        }

        System.out.println(sb.reverse());
    }
}