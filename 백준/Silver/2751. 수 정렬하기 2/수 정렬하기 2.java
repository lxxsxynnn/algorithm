import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if(line != null) {
                list.add(Integer.parseInt(line));
            }
        }

        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for(int num : list) sb.append(num + "\n");
        
        System.out.print(sb);
    }
}