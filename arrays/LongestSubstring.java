class longestUniqueSubstring {
    int longestUniqueSubstring(String s) {
        int left = 0;

        int max = 0;

        Map<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // ✅ add current character to map
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) + 1);

            // ✅ shrink from left until no duplicate
            while (hash.get(s.charAt(i)) > 1) {
                hash.put(s.charAt(left), hash.get(s.charAt(left)) - 1);
                if (hash.get(s.charAt(left)) == 0) {
                    hash.remove(s.charAt(left));
                }
                left++;
            }

            // ✅ window size = i - left + 1
            max = Math.max(max, i - left + 1);
        }

        return max;
    }
}
```

---

### Trace `"geeksforgeeks"`
```
i=0: add g → {g:1},           window=[g],        max=1
i=1: add e → {g:1,e:1},       window=[ge],       max=2
i=2: add e → {g:1,e:2} ← DUP!
     remove left(g) → {e:2}, left=1
     remove left(e) → {e:1}, left=2
     window=[e],               max=2
i=3: add k → {e:1,k:1},       window=[ek],       max=2
i=4: add s → {e:1,k:1,s:1},   window=[eks],      max=3
i=5: add f → {e:1,k:1,s:1,f:1} window=[eksf],   max=4
i=6: add o → {...,o:1},        window=[eksfo],    max=5
i=7: add r → {...,r:1},        window=[eksfor],   max=6
i=8: add g → {...,g:1},        window=[eksforg],  max=7 ✅
i=9: add e → {e:2} ← DUP!
     shrink until e:1 ...      max stays 7
...
Output: 7 ✅