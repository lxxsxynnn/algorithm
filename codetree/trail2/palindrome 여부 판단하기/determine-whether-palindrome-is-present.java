import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a= sc.next();
        System.out.print(palindrome(a));
    }

    public static String palindrome(String str){
        boolean isPalindrome = true;

        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome? "Yes" : "No";
    }
}