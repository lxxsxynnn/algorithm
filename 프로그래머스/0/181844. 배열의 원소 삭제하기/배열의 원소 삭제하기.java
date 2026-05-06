import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            boolean isDeleted = false;

            for (int del : delete_list) {
                if (num == del) {
                    isDeleted = true;
                    break;
                }
            }

            if (!isDeleted) {
                result.add(num);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}