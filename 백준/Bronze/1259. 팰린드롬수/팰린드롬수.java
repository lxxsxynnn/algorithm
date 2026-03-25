import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String number = br.readLine();

            if(number.equals("0")) break;

            int length = number.length();
            boolean isPalindrome = true;

            for (int i = 0; i < length / 2; i++) {
                if(number.charAt(i) != number.charAt(length -1 -i)){
                    isPalindrome = false;
                    break;
                }
            }

            sb.append(isPalindrome? "yes" : "no").append("\n");
        }
        System.out.print(sb);
    }
}