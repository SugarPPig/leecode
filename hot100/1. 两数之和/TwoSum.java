import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static void main(String[] args) {
        // 两数之和
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0] + " " + ints[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}