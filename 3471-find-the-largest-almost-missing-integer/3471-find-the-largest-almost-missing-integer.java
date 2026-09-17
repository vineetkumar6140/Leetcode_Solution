import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer, Integer> count = new HashMap<>();

        // Check every subarray of size k
        for (int i = 0; i <= nums.length - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            // Take one subarray
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Count each number only once per subarray
            for (int num : set) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
        }

        // Find the largest number appearing in exactly one subarray
        int answer = -1;

        for (int num : count.keySet()) {
            if (count.get(num) == 1) {
                answer = Math.max(answer, num);
            }
        }

        return answer;
    }
}