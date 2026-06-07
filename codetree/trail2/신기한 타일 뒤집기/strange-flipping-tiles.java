import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] tiles = new char[200001];
        int OFFSET = 100000;
        int curr = OFFSET;
        
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();

            if(direction.equals("L")){
                for(int i = curr; i > curr - x; i--){
                    tiles[i] = 'W';
                }
                curr -= (x - 1);
            } else {
                for(int i = curr; i < curr + x; i++){
                    tiles[i] = 'B';
                }
                curr += (x - 1);
            }
        }

        int w = 0;
        int b = 0;
        
        for(char tile : tiles){
            if(tile == 'W') w++;
            else if(tile == 'B') b++;
        }

        System.out.println(w + " " + b);
    }
}