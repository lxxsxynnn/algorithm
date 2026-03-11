import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) - 1;
        String str = br.readLine();
        char[] result = str.toCharArray();

        while(N-- > 0){
            String str2 = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != str2.charAt(i)){
                    result[i] = '?';
                }
            }
        }

        System.out.print(result);
    }
}