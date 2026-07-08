import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.print(moreThanOneAlphabet(A));
    }

    public static String moreThanOneAlphabet(String str){
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i - 1)) return "Yes";
        }

        return "No";
    }
}