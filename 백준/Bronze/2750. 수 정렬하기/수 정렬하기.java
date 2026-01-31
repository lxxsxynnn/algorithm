import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashSet<Integer> nums = new HashSet<>();

        for (int i = 0; i < N; i++) {
            nums.add(sc.nextInt());
        }

        nums.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
    }
}