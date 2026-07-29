import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] arr = new Agent[5];
        int min = 100;
        int idx = 0;

        for(int i = 0; i < 5; i++){
            char code = sc.next().charAt(0);
            int score = sc.nextInt();
            arr[i] = new Agent(code, score);

            if(score < min) {
                min = score;
                idx = i;
            }
        }

        System.out.print(arr[idx].code + " " + arr[idx].score);
    }
}

class Agent{
    char code;
    int score;

    public Agent(char code, int score){
        this.code = code;
        this.score = score;
    }
}