import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String X = st.nextToken();
        String Y = st.nextToken();

        int sum = reversedNum(X) + reversedNum(Y);
        System.out.println(reversedNum(String.valueOf(sum)));
    }

    public static int reversedNum(String n){
        StringBuffer num = new StringBuffer(n);
        return Integer.parseInt(num.reverse().toString());
    }
}