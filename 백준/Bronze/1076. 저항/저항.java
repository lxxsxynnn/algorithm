import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = getValue(br.readLine());
        long b = getValue(br.readLine());
        long c = (long) Math.pow(10, getValue(br.readLine()));

        System.out.print((10 * a + b) * c);
    }

    static long getValue(String str){
        switch(str){
            case "black": return 0;
            case "brown": return 1;
            case "red": return 2;
            case "orange": return 3;
            case "yellow": return 4;
            case "green": return 5;
            case "blue": return 6;
            case "violet": return 7;
            case "grey": return 8;
            case "white": return 9;
            default: return 0;
        }
    }
}