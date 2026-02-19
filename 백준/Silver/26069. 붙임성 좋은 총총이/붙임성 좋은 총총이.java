import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> dancers = new HashSet<>();
        dancers.add("ChongChong");

        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String user1 = st.nextToken();
            String user2 = st.nextToken();

            if(dancers.contains(user1) || dancers.contains(user2)) {
                dancers.add(user1);
                dancers.add(user2);
            }
        }

        System.out.print(dancers.size());
    }
}