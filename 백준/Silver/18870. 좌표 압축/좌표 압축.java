import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 중복 제거를 위해 정렬된 배열 생성
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        // 2. HashMap에 값과 등수(순위) 매칭하기
        int rank = 0;
        HashMap<Integer, Integer> numsRank = new HashMap<>();
        for(int num : sortedNums) {
            if(!numsRank.containsKey(num)){
                numsRank.put(num, rank);
                rank++;
            }
        }

        // 3. 원래 배열(nums)을 순회하며 Map에서 순위만 뽑아내기
        StringBuilder sb = new StringBuilder();
        for (int key : nums) {
            sb.append(numsRank.get(key)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}