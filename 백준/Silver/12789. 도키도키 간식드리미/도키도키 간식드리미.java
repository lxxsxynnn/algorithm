import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> waiting = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int curr = 1;

        for (int i = 0; i < N; i++) {
            int student = Integer.parseInt(st.nextToken());

            if(curr == student) curr++;
            else waiting.push(student);

            while(!waiting.isEmpty() && waiting.peek() == curr){
                waiting.pop();
                curr++;
            }
        }

        System.out.println(waiting.isEmpty()? "Nice" : "Sad");
    }
}