import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] cnt = new int[26];

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                cnt[str.charAt(i) - 'A']++;
            } else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cnt[str.charAt(i) - 'a']++;
            }
        }

        int max = 0;
        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] > max) {
                max = cnt[i];
            }
        }

        int idxCnt = 0;
        int idx = 0;

        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] == max) {
                idxCnt++;
                idx = i;
            }
        }

        if (idxCnt == 1) {
            System.out.println((char)('A' + idx));
        } else System.out.println("?");
    }
}
