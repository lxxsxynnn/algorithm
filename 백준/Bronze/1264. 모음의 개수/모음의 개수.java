import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String line = br.readLine();
            int count = 0;
            String vowels = "aeiouAEIOU";

            if(line.equals("#")) break;

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (vowels.indexOf(c) != -1) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}