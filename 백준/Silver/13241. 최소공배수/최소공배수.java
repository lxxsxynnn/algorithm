import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        System.out.println(A * B / gcd(A, B));
    }

    static long gcd(long A, long B) {
        while(B != 0) {
            long r = A % B;
            A = B;
            B = r;
        }

        return A;
    }
}