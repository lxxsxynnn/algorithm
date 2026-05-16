import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] blocks = new int[N];

        while(K-- > 0){
            line = br.readLine();
            st = new StringTokenizer(line);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            for(int i = A - 1; i < B; i++){
                blocks[i]++;
            }
        }

        int max = 0;

        for(int block : blocks){
            if(block > max) max = block;
        }

        System.out.println(max);
    }
}