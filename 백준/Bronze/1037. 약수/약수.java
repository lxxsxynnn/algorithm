import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(N-- > 0){
            int val = Integer.parseInt(st.nextToken());
            if(val < min) min = val;
            if(val > max) max = val;
        }

        System.out.print((long) min * max);
    }
}