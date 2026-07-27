import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(str.startsWith(t)){
                list.add(str);
            }
        }

        Collections.sort(list);

        System.out.println(list.get(k - 1));
    }
}