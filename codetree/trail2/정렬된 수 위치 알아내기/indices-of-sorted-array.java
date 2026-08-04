import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Number> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            Number num = new Number(sc.nextInt(), i + 1);
            list.add(num);
        }

        Collections.sort(list);
        
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[list.get(i).idx - 1] = i + 1;
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}

class Number implements Comparable<Number>{
    int val, idx;

    public Number(int val, int idx){
        this.val = val;
        this.idx = idx;
    }

    @Override
    public int compareTo(Number num){
        return Integer.compare(this.val, num.val);
    }
}