import java.util.HashMap;
import java.util.Map;

class Maximum_Sum_of_Distinct_Subarrays_With_Length_K{


    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        long sum = 0;
        long max = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // 1. Add right element to window
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            sum += nums[right];

            // 2. Shrink from left until no duplicates
            while (freq.get(nums[right]) > 1) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) freq.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // 3. If window is exactly size k, update max
            if (right - left + 1 == k) {
                max = Math.max(max, sum);
                // Slide left pointer forward
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) freq.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        
        int nums[]={}
    }
}


    
