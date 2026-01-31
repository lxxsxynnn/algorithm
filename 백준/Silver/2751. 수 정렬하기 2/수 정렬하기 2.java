import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if(line != null) {
                nums[i] = Integer.parseInt(line);
            }
        }

        Arrays.sort(nums);
        for(int num : nums) System.out.println(num);
    }
}