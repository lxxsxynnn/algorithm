import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열 입력받기
        String str = sc.next();
        
        // 문자열을 문자 배열(char[])로 변환
        char[] chars = str.toCharArray();
        
        // 알파벳 오름차순(사전순) 정렬
        Arrays.sort(chars);
        
        // 정렬된 문자 배열을 다시 문자열로 변환하여 출력
        System.out.println(new String(chars));
        
        sc.close();
    }
}