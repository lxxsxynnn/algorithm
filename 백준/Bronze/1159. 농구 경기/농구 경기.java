import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       int N = Integer.parseInt(br.readLine());
       int[] alphabet = new int[26];

       while(N-- > 0){
           String name = br.readLine();
           alphabet[name.charAt(0) - 'a']++;
       }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] >= 5) {
                sb.append((char) (i + 'a'));
            }
        }

        if (sb.length() == 0) {
            System.out.print("PREDAJA");
        } else {
            System.out.print(sb);
        }
    }
}