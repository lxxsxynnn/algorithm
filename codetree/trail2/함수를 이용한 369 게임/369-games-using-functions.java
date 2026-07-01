import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(hasThreeSixNineDigit(i) || isMultipleOfThree(i)) cnt++;
        }

        System.out.print(cnt);
    }

    public static boolean hasThreeSixNineDigit(int n){
        String str = Integer.toString(n);
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '3' || 
            str.charAt(i) == '6' || 
            str.charAt(i) == '9') {
                return true;
            }
        }

        return false;
    }

    public static boolean isMultipleOfThree(int n){
        if(n % 3 == 0) return true;
        else return false;
    }
}