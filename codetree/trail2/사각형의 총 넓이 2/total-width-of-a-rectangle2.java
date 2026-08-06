import java.io.*;
import java.util.*;

public class Main {

    static class Rect {
        int x1, y1, x2, y2;

        Rect(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Rect[] rects = new Rect[N];
        ArrayList<Integer> xs = new ArrayList<>();
        ArrayList<Integer> ys = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            rects[i] = new Rect(x1, y1, x2, y2);

            xs.add(x1);
            xs.add(x2);
            ys.add(y1);
            ys.add(y2);
        }

        Collections.sort(xs);
        Collections.sort(ys);

        ArrayList<Integer> xList = new ArrayList<>();
        ArrayList<Integer> yList = new ArrayList<>();

        for (int x : xs) {
            if (xList.isEmpty() || xList.get(xList.size() - 1) != x) {
                xList.add(x);
            }
        }

        for (int y : ys) {
            if (yList.isEmpty() || yList.get(yList.size() - 1) != y) {
                yList.add(y);
            }
        }

        int area = 0;

        for (int i = 0; i < xList.size() - 1; i++) {
            int lx = xList.get(i);
            int rx = xList.get(i + 1);

            for (int j = 0; j < yList.size() - 1; j++) {
                int by = yList.get(j);
                int ty = yList.get(j + 1);

                boolean covered = false;

                for (Rect r : rects) {
                    if (r.x1 <= lx && rx <= r.x2 &&
                        r.y1 <= by && ty <= r.y2) {
                        covered = true;
                        break;
                    }
                }

                if (covered) {
                    area += (rx - lx) * (ty - by);
                }
            }
        }

        System.out.println(area);
    }
}