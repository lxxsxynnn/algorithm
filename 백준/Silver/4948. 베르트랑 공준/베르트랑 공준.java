import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line == null || line.equals("0")) break; // 0이 들어오면 종료

            int n = Integer.parseInt(line);
            int cnt = 0;

            for (int i = n + 1; i <= 2 * n; i++) {
                if(isPrime(i)) cnt++;
            }
            sb.append(cnt).append("\n");
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