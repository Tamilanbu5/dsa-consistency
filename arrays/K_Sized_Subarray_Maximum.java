import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class K_Sized_Subarray_Maximum {

   
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>(); // stores indices
        int left = 0;

        for (int i = 0; i < arr.length; i++) {
            // Rule 1: remove from back if smaller than current
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Rule 2: add current index
            dq.addLast(i);

            // Rule 3: window size == k
            if (i - left + 1 == k) {
                // remove front if outside window
                if (dq.peekFirst() < left) dq.pollFirst();

                list.add(arr[dq.peekFirst()]); // front = max
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3,1,4,5,2,3,6};

        int k=3;

        System.out.print(maxOfSubarrays(arr, k));
    }
}
    

