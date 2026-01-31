import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> wordsSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            wordsSet.add(br.readLine());
        }

        ArrayList<String> wordsList = new ArrayList<>(wordsSet);

        Collections.sort(wordsList, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(String word : wordsList){
            bw.write(word + "\n");
        }
        bw.flush();
        bw.close();
    }
}