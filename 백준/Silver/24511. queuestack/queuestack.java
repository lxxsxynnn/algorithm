import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] types = new int[N];
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        StringTokenizer line = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) types[i] = Integer.parseInt(line.nextToken());

        line = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(line.nextToken());

            if(types[i] == 0) deque.addLast(value);
        }

        int M = Integer.parseInt(br.readLine());
        line = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        while(M-- > 0){
            int newVal = Integer.parseInt(line.nextToken());
            deque.addFirst(newVal);
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}