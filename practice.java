import java.util.Arrays;

public class practice {
    public static void printThreeSum(int[] nums) {
        // Safe check for null or fewer than 3 elements
        if (nums == null || nums.length < 3) {
            return;
        }

        int n = nums.length;

        // Step 1: Sort the array to place duplicates next to each other
        Arrays.sort(nums);

        // Loop 1: Pick the first element (stops at n - 2 to leave 2 spots)
        for (int i = 0; i < n - 2; i++) {
            // Optimization: three positive numbers cannot sum to 0
            if (nums[i] > 0) break;

            // Skip duplicate values for the first spot
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Loop 2: Pick the second element (stops at n - 1 to leave 1 spot)
            for (int j = i + 1; j < n - 1; j++) {
                // Skip duplicate values for the second spot
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Loop 3: Pick the third element (goes up to the end)
                for (int k = j + 1; k < n; k++) {
                    // Skip duplicate values for the third spot
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }

                    // Condition: check if sum equals 0
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println("[" + nums[i] + ", " + nums[j] + ", " + nums[k] + "]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {};
        printThreeSum(nums);
    }
}

    

