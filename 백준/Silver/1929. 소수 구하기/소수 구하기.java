import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = M; i <= N; i++) {
            if(isPrime(i)){
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb);
    }

    static boolean isPrime(int l){
        if (l < 2) return false;
        if(l== 2 || l == 3) return true;
        if(l % 2 == 0 || l % 3 == 0) return false;

        for(int i = 5; i * i <= l; i += 6) {
            if(l % i == 0 || l % (i + 2) == 0) return false;
        }
        return true;
    }
}