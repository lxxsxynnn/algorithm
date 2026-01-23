import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            String s = sc.next();
            boolean isGroupWord = true;
            boolean[] isVisited = new boolean[26];

            for(int j = 0; j < s.length(); j++) {
                if(j > 0 && s.charAt(j) != s.charAt(j-1)) {
                    if(isVisited[s.charAt(j)-'a']) {
                        isGroupWord = false;
                        break;
                    }
                }
                isVisited[s.charAt(j)-'a'] = true;
            }
            if(isGroupWord) cnt++;
        }

        System.out.println(cnt);
    }
}
