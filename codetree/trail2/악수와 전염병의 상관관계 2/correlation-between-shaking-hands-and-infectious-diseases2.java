import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //전체 개발자 수
        int k = sc.nextInt();   //감염시킬 수 있는 악수 횟수
        int p = sc.nextInt();   //감염된 개발자 번호
        int t = sc.nextInt();   //전체 악수 횟수
        

        Developer[] devs = new Developer[n + 1];

        for(int i = 1; i <= n; i++){
            Developer d = new Developer();
            devs[i] = d;
        }

        devs[p].infected = 1;
        devs[p].count = k;

        Shake[] shakes = new Shake[t];

        for(int i = 0; i < t; i++){
            Shake s = new Shake(sc.nextInt(), sc.nextInt(), sc.nextInt());
            shakes[i] = s;
        }

        Arrays.sort(shakes, (x, y) -> x.time - y.time);

        for(int i = 0; i < t; i++){
            int a = shakes[i].a;
            int b = shakes[i].b;
            boolean infectedA = devs[a].infected == 1;
            boolean infectedB = devs[b].infected == 1;

            if(infectedA && devs[a].count > 0){
                devs[a].count--;

                if(devs[b].infected == 0){
                    devs[b].infected = 1;
                    devs[b].count = k;
                }
            }

            if(infectedB && devs[b].count > 0){
                devs[b].count--;

                if(devs[a].infected == 0){
                    devs[a].infected = 1;
                    devs[a].count = k;
                }
            }
        }

        for(int i = 1; i <= n; i++){
            System.out.print(devs[i].infected);
        }
        
    }
}

class Developer{
    int infected;
    int count;
    
    public Developer(){
        this.infected = 0;
        this.count = 0;
    }
}

class Shake {
    int time;
    int a;
    int b;

    public Shake(int time, int a, int b) {
        this.time = time;
        this.a = a;
        this.b = b;
    }
}