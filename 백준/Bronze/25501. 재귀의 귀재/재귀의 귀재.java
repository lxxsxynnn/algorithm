import java.io.*;

public class Main{
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(N-- > 0) {
            String word = br.readLine();
            count = 0;
            int result = isPalindrome(word);
            sb.append(result).append(" ").append(count).append("\n");
        }

        System.out.print(sb);
    }

    public static int recursion(String s, int l, int r){
        count++;

        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
