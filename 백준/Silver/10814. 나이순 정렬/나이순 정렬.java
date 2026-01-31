import java.io.*;
import java.util.*;

public class Main {

    static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Member[] members = new Member[N];

        for(int i = 0; i < N; i++){
            String info = br.readLine();
            StringTokenizer st = new StringTokenizer(info);

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            members[i] = new Member(age, name);
        }

        Arrays.sort(members, Comparator.comparingInt(a -> a.age));

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(members[i].age).append(" ").append(members[i].name).append("\n");
        }
        System.out.print(sb);
    }
}