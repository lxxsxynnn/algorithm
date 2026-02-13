import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> card = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            card.add(i + 1);
        }

        while(card.size() > 1){
            card.poll();
            int n = card.poll();
            card.add(n);
        }

        System.out.print(card.peek());
    }
}