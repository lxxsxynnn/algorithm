import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = 0;
        int O = 0;
        int V = 0;
        int E = 0;

        String name = br.readLine();

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if(c == 'L') L++;
            else if(c == 'O') O++;
            else if(c == 'V') V++;
            else if(c == 'E') E++;
        }

        int N = Integer.parseInt(br.readLine());
        String[] teams = new String[N];

        for (int i = 0; i < N; i++) {
            teams[i] = br.readLine();
        }
        Arrays.sort(teams);

        int maxScore = -1;
        String bestTeam = "";

        for (String team : teams) {
            int score = getScore(team, L, O, V, E);

            if (score > maxScore) {
                maxScore = score;
                bestTeam = team;
            }
        }

        System.out.println(bestTeam);
    }

    //팀 이름을 넣으면 최종 점수를 반환하는 함수
    public static int getScore(String teamName, int pL, int pO, int pV, int pE) {
        int tL = pL, tO = pO, tV = pV, tE = pE;

        for (int i = 0; i < teamName.length(); i++) {
            char c = teamName.charAt(i);
            if (c == 'L') tL++;
            else if (c == 'O') tO++;
            else if (c == 'V') tV++;
            else if (c == 'E') tE++;
        }

        return ((tL + tO) * (tL + tV) * (tL + tE) * (tO + tV) * (tO + tE) * (tV + tE)) % 100;
    }
}