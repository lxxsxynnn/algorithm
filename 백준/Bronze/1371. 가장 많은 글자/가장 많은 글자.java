import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];

        int c;
        while ((c = br.read()) != -1) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a']++;
            }
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == max) {
                sb.append((char) ('a' + i));
            }
        }

        System.out.println(sb.toString());
    }
}