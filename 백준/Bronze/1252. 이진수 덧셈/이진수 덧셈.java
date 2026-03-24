import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String binary1 = st.nextToken();
        String binary2 = st.nextToken();

        BigInteger b1 = new BigInteger(binary1, 2);
        BigInteger b2 = new BigInteger(binary2, 2);

        BigInteger sum = b1.add(b2);

        System.out.println(sum.toString(2));
    }
}