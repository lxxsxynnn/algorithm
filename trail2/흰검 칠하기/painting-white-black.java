import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int SIZE = 200001;
        int OFFSET = 100000;

        int[] white = new int[SIZE];
        int[] black = new int[SIZE];
        char[] color = new char[SIZE];
        
        int curr = OFFSET;

        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();

            if(direction.equals("L")){
                for(int i = curr; i > curr - x; i--){
                    if(color[i] == 'G') continue;

                    white[i]++;
                    color[i] = 'W';

                    if(white[i] >= 2 && black[i] >= 2){
                        color[i] = 'G';
                    }
                }
                curr -= (x - 1);
            } else {
                for(int i = curr; i < curr + x; i++){
                    if(color[i] == 'G') continue;
                    
                    black[i]++;
                    color[i] = 'B';

                    if(white[i] >= 2 && black[i] >= 2){
                        color[i] = 'G';
                    }
                }
                curr += (x - 1);
            }
        }

        int w = 0;
        int b = 0;
        int g = 0;
        
        for(char currentColor: color){
            if(currentColor == 'W') w++;
            else if(currentColor == 'B') b++;
            else if(currentColor == 'G') g++;
        }

        System.out.println(w + " " + b + " " + g);
    }
}