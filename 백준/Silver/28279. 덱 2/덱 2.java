import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch(command){
                case 1: deque.addFirst(Integer.parseInt(st.nextToken())); break;
                case 2: deque.addLast(Integer.parseInt(st.nextToken())); break;
                case 3:
                    Integer val = deque.pollFirst();
                    sb.append(val == null? -1: val).append("\n");
                    break;
                case 4:
                    val = deque.pollLast();
                    sb.append(val == null? -1 : val).append("\n");
                    break;
                case 5: sb.append(deque.size()).append("\n"); break;
                case 6: sb.append(deque.isEmpty()? 1 : 0).append("\n"); break;
                case 7:
                    val = deque.peekFirst();
                    sb.append(val == null? -1 : val).append("\n");
                    break;
                case 8:
                    val = deque.peekLast();
                    sb.append(val == null? -1: val).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}