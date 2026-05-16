import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        int[] blocks = new int[101];

        while(N-- > 0){
            line = br.readLine();
            st = new StringTokenizer(line);
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for(int i = x1; i <= x2; i++){
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