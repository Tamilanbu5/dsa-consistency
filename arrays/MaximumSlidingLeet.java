import java.util.HashMap;
import java.util.Map;

class MaximumSlidingLeet {
    static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();  // stays int, int ✅
        long sum = 0;   // ← changed to long ✅
        long max = 0;   // ← changed to long ✅
        int left = 0;   // stays int ✅

        for (int right = 0; right < nums.length; right++) {  // stays int ✅
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            sum += nums[right];

            while (freq.get(nums[right]) > 1) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) freq.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            if (right - left + 1 == k) {
                max = Math.max(max, sum);
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) freq.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return max;
    }

    public static void main (String args[]){

        int nums[]={1,5,4,2,9,9,9};
        int k=3;

        System.out.print(maximumSubarraySum(nums, k));


    }
}