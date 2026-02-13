import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> people = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            people.add(i + 1);
        }

        sb.append("<");
        while(people.size() > 1){
            for (int i = 0; i < K - 1; i++) {
                //K-1번째 사람까지 뒤로 이동
                people.add(people.poll());
            }
            //K번째 사람은 제거
            sb.append(people.poll()).append(", ");
        }

        sb.append(people.poll()).append(">");
        System.out.println(sb);
    }
}