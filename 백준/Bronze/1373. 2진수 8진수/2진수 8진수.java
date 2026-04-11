import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        int len = s.length();
        
        if (len % 3 == 1) {
            sb.append(s.charAt(0) - '0');
        } else if (len % 3 == 2) {
            int val = (s.charAt(0) - '0') * 2 + (s.charAt(1) - '0');
            sb.append(val);
        }
        
        for (int i = len % 3; i < len; i += 3) {
            int val = (s.charAt(i) - '0') * 4 
                    + (s.charAt(i + 1) - '0') * 2 
                    + (s.charAt(i + 2) - '0') * 1;
            sb.append(val);
        }

        System.out.println(sb.toString());
    }
}