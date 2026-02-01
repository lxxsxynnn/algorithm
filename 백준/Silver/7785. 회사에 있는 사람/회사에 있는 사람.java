import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, String> logs = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            String name = st.nextToken();
            String status = st.nextToken();

            if(status.equals("enter")){
                logs.put(name, status);
            } else {
                logs.remove(name);
            }
        }

        ArrayList<String> remaining = new ArrayList<>(logs.keySet());
        Collections.sort(remaining, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(String name : remaining){
            sb.append(name + "\n");
        }

        System.out.println(sb);
    }
}