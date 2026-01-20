import java.util.*;

public class TwoSum {

    static int[] find(int arr[], int target) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        int arrr[] = new int[2];

        for (int i = 0; i < arr.length; i++) {

            int check = target - arr[i];

            if (hash.containsKey(check)) {
                arrr[0] = hash.get(check);
                arrr[1] = i;
                return arrr;
            }

            // 🔥 MISSING LINE (this was the main bug)
            hash.put(arr[i], i);
        }

        return arrr;
    }

    public static void main(String args[]) {

        int arr[] = {2, 7, 11, 15};
        int target = 9;

        int[] res = find(arr, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
