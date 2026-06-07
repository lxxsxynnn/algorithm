import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int ten = 0;

        for(int i = 0; i < N.length(); i++){
            ten += (N.charAt(i) - '0') * Math.pow(2, (N.length() - 1 - i));
        }

        StringBuilder sb = new StringBuilder();

        ten *= 17;
        
        while(ten > 0){
            sb.append(ten % 2);
            ten /= 2;
        }

        System.out.println(sb.reverse());
    }
}