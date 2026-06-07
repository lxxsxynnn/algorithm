import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] state = new int[4];

        for(int i = 0; i < 3; i++){
            char symp = sc.next().charAt(0);
            int temp = sc.nextInt();

            if(symp == 'Y'){
                if(temp >= 37) state[0]++;
                else state[2]++;
            } else {
                if(temp >= 37) state[1]++;
                else state[3]++;
            }
        }

        for(int n : state){
            System.out.print(n + " ");
        }

        if(state[0] >= 2) System.out.print('E');
    }
}