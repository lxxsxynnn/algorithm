public class Main {
    public static void main(String[] args) {
        int weight = 13;
        double ratio = 0.165;

        System.out.printf("%.0f * %.6f = %.6f",
                (double) weight,
                ratio,
                weight * ratio);
    }
}