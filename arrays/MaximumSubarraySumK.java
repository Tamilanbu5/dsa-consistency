public class MaximumSubarraySumK {
     static int maxSubarraySum(int[] arr, int k) {

        int left = 0;
        int sum = 0;
        int max = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            if (right - left + 1 == k) {

                max = Math.max(max, sum);

                sum -= arr[left];
                left++;
            }
        }

        return max;
    }

    public static void main (String args[]){

        int arr[]={100,200,300,400};

        int k=2;

        System.out.print(maxSubarraySum(arr,k));
    }
    
}
