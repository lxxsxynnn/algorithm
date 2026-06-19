import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        boolean containsEE = false;
        boolean containsAB = false;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 2).equals("ee")){
                containsEE = true;
            };
        }

        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 2).equals("ab")){
                containsAB = true;
            };
        }

        System.out.print((containsEE? "Yes" : "No") + " " + (containsAB? "Yes" : "No"));
    }
}