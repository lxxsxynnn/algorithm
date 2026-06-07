import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String c = br.readLine();
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 8; i++){
            sb.append(c);
        }

        System.out.println(sb);
    }
}