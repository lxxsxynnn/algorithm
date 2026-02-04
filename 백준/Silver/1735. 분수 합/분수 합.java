import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(line1);

        int A = Integer.parseInt(st1.nextToken());
        int B = Integer.parseInt(st1.nextToken());

        String line2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(line2);

        int C = Integer.parseInt(st2.nextToken());
        int D = Integer.parseInt(st2.nextToken());

        int numerator = A * D + C * B;   // 분자
        int denominator = B * D;         // 분모

        int common = getGCD(numerator, denominator);

        System.out.print((numerator / common) + " " + (denominator / common));
    }

    static int getGCD(int A, int B) {
        while(B != 0){
            int r = A % B;
            A = B;
            B = r;
        }
        return A;
    }
}