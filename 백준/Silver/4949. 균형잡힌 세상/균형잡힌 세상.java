import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //문장 마지막에 .이 오고 더이상 입력이 없으면 반복 종료
        while (true) {
            String line = br.readLine();
            if(line == null || line.equals(".")) break;
            sb.append(checkBalance(line)).append("\n");
        }
        System.out.print(sb);
    }

    static String checkBalance(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty() || stack.peek() != '(') return "no";
                stack.pop();
            } else if(c == ']') {
                if(stack.isEmpty() || stack.peek() != '[') return "no";
                stack.pop();
            }
        }

        return stack.isEmpty() ? "yes" : "no";
    }
}