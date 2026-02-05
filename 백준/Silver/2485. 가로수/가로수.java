import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int g = 0;
        for (int i = 1; i < N; i++) {
            int diff = trees[i] - trees[i-1];
            if (i == 1) g = diff;
            else g = getGCD(g, diff);
        }

        long totalTrees = (trees[N-1] - trees[0]) / g + 1;
        System.out.println(totalTrees - N);
    }

    static int getGCD(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}