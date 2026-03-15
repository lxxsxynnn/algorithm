import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int tmp = N;

        while(true){
            int first = tmp / 10;
            int second = tmp % 10;

            tmp = (second * 10) + ((first + second) % 10);

            count++;

            if(N == tmp) break;
        }

        System.out.print(count);
    }
}