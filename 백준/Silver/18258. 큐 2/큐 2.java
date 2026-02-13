import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();

        while(N-- > 0){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            String command = st.nextToken();

            switch(command){
                case "push": queue.add(Integer.parseInt(st.nextToken())); break;
                case "pop":
                    // poll()은 비어있으면 null을 반환하므로 -1 처리가 필요함
                    Integer p = queue.poll();
                    sb.append(p == null ? -1 : p).append("\n");
                    break;
                case "size": sb.append(queue.size()).append("\n"); break;
                case "empty": sb.append(queue.isEmpty()? 1 : 0).append("\n"); break;
                case "front": sb.append(queue.isEmpty()? -1 : queue.peekFirst()).append("\n"); break;
                case "back": sb.append(queue.isEmpty()? -1 : queue.peekLast()).append("\n"); break;
            }
        }

        System.out.print(sb);
    }
}