import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
            
            if(i % 2 == 0) {
                Collections.sort(list);
                System.out.print(list.get(i / 2) + " ");
            }
        }
    }
}