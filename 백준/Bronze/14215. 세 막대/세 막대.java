import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] sides = new int[3];

        for(int i = 0; i < 3; i++){
            sides[i] = sc.nextInt();
        }

        Arrays.sort(sides);

        if(sides[0] + sides[1] > sides[2]){
            System.out.println(sides[0] + sides[1] + sides[2]);
        } else {
            System.out.println((sides[0] + sides[1]) * 2 - 1);
        }
    }
}