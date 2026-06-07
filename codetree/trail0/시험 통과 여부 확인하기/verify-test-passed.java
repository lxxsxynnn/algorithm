import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N >= 80) System.out.println("pass");
        else System.out.println(80 - N + " more score");
    }
}