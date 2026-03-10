import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;


class k {

     static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {

        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for(int i = 0; i < arr.length; i++){

            // Remove indices that are outside the window
            if(!dq.isEmpty() && dq.peek() <= i - k){
                dq.poll();
            }

            // Remove smaller elements from the back
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.pollLast();
            }

            // Add current index
            dq.add(i);

            // If window size is ready
            if(i >= k - 1){
                result.add(arr[dq.peek()]);
            }
        }

        return result;
    }




    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        System.out.print(maxOfSubarrays(arr,k));




    }

}

