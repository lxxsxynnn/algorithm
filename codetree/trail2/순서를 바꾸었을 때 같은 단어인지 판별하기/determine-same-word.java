import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr1 = sc.next().toCharArray();
        char[] arr2 = sc.next().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.print(Arrays.equals(arr1, arr2)? "Yes" : "No");
    }
}