import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        HashSet<String> users = new HashSet<>();

        while(N-- > 0){
            String user = br.readLine();

            if(user.equals("ENTER")){
                result += users.size();
                users.clear();
            } else {
                users.add(user);
            }
        }
        result += users.size();
        System.out.print(result);
    }
}