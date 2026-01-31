import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < line.length(); i++) {
            list.add(line.charAt(i) - '0');
        }

        Collections.sort(list, Collections.reverseOrder());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int num : list) {
            bw.write(num+"");
        }

        bw.flush();
        bw.close();
    }
}