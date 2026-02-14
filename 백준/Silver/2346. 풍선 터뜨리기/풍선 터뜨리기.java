import java.io.*;
import java.util.*;

public class Main {
    static class Balloon {
        int num, value;
        Balloon(int num, int value) {
            this.num = num;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Balloon> balloons = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            balloons.add(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();

        while(!balloons.isEmpty()){

            Balloon current = balloons.pollFirst();
            sb.append(current.num).append(" ");

            if(balloons.isEmpty()) break;

            int next = current.value;

            if(next > 0){
                for (int i = 0; i < next - 1; i++) {
                    balloons.addLast(balloons.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(next); i++) {
                    balloons.addFirst(balloons.pollLast());
                }
            }
        }

        System.out.print(sb);
    }
}