import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> dictionary = new HashMap<>();

        while(N-- > 0){
            String word = br.readLine();

            if(word.length() >= M){
                dictionary.put(word, dictionary.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(dictionary.keySet());

        words.sort((o1, o2) -> {
            int count1 = dictionary.get(o1);
            int count2 = dictionary.get(o2);

            if (count1 != count2) {
                return count2 - count1;
            }
            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            }
            return o1.compareTo(o2);
        });

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append("\n");
        }
        System.out.print(sb);
    }
}