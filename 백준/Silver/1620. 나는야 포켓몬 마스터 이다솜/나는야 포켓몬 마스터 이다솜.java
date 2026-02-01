import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] numToName = new String[N + 1];
        HashMap<String, Integer> nameToNum = new HashMap<>();

        for (int i = 1; i < N + 1; i++) {
            String name = br.readLine();
            numToName[i] = name;
            nameToNum.put(name, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String question = br.readLine();

            if(Character.isDigit(question.charAt(0))) {
                sb.append(numToName[Integer.parseInt(question)]);
            } else {
                sb.append(nameToNum.get(question));
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}