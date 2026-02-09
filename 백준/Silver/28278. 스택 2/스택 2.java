import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            switch (type) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if(stack.isEmpty()) sb.append("-1\n");
                    else sb.append(stack.pop()).append("\n");
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case 5:
                    if(stack.isEmpty()) sb.append("-1\n");
                    else sb.append(stack.peek()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}