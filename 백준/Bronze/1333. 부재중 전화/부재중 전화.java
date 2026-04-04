import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //앨범 수록곡 수
        int L = Integer.parseInt(st.nextToken()); //모든 노래의 길이
        int D = Integer.parseInt(st.nextToken()); //벨이 울리는 타이밍

        int currentTime = 0;
        int bellTime = 0;

        for (int i = 0; i < N; i++) {
            currentTime += L;
            int muteTime = currentTime + 5;

            while(bellTime < muteTime){
                if (bellTime >= currentTime) {
                    System.out.println(bellTime);
                    return;
                }
                bellTime += D;
            }
            currentTime = muteTime;
        }

        System.out.println(bellTime);
    }
}