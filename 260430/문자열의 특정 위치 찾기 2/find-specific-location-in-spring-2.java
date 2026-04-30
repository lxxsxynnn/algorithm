import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruits = {"apple", "banana", "grape", "blueberry", "orange"};
        char c = sc.next().charAt(0);
        int count = 0;

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].charAt(2) == c || fruits[i].charAt(3) == c) {
                System.out.println(fruits[i]);
                count++;
                }
        }
        System.out.println(count);
    }
}