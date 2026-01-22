import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length()
                    && str.charAt(i) == 'd'
                    && str.charAt(i + 1) == 'z'
                    && str.charAt(i + 2) == '=') {
                i += 2;
            } else if (i + 1 < str.length()) {
                    switch (str.charAt(i)) {
                        case 'c':
                            if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') i++;
                            break;
                        case 'd':
                            if (str.charAt(i + 1) == '-') i++;
                            break;
                        case 'l':
                        case 'n':
                            if (str.charAt(i + 1) == 'j') i++;
                            break;
                        case 's':
                        case 'z':
                            if (str.charAt(i + 1) == '=') i++;
                            break;
                        default:
                            break;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
