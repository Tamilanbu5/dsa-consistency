import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.Line;

public class Subarrays_with_sum_k {

    public int cntSubarrays(int[] arr, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // ← important, will explain below
        
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];                          // step 1: build prefix sum
            
            int need = sum - k;                     // step 2: what we need to find
            
            if (map.containsKey(need)) {            // step 3: seen it before?
                count += map.get(need);             // step 4: add its frequency
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);  // step 5: store current sum
        }
        
        return count;
    }
}
```

---

## Why `map.put(0, 1)` — Line by Line

Imagine `arr = [10, 2, -2, -20, 10]`, `k = -10`

At `i = 3`, sum = `-10`
```
need = sum - k = -10 - (-10) = 0
```
**"Have I seen prefix sum = 0 before?"**

Yes — at the very beginning (before the array started), sum was 0.
That means subarray from index `0 to 3` itself equals `k`.

Without `map.put(0, 1)` → you'd **miss this entirely**.

---

## Full Dry Run — `arr = [10, 2, -2, -20, 10]`, `k = -10`

| i | arr[i] | sum | need = sum-k | map has need? | count | map |
|---|--------|-----|--------------|---------------|-------|-----|
| - | - | 0 | - | - | 0 | {0:1} |
| 0 | 10 | 10 | 20 | ❌ | 0 | {0:1, 10:1} |
| 1 | 2 | 12 | 22 | ❌ | 0 | {0:1, 10:1, 12:1} |
| 2 | -2 | 10 | 20 | ❌ | 0 | {0:1, 10:2, 12:1} |
| 3 | -20 | -10 | 0 | ✅ → count+=1 | 1 | {0:1, 10:2, 12:1, -10:1} |
| 4 | 10 | 0 | 10 | ✅ → count+=2 | 3 | {0:2, 10:2, 12:1, -10:1} |

**Output = 3 ✅**

---

### Why count += 2 at i=4?

`need = 10`, and map has `10:2` — meaning prefix sum `10` was seen **twice** (at i=0 and i=2).

That means **two different subarrays** end at i=4 and have sum = k:
```
arr[1...4] = [2, -2, -20, 10]  → sum = -10 ✅
arr[3...4] = [-20, 10]         → sum = -10 ✅

    
}
