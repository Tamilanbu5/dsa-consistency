public class CountSubstrings { public static int countSubstrs(String s) {
        int n = s.length();
        int ct = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                
               
                String substr = s.substring(i, j);
                int ct0 = 0, ct1 = 0, ct2 = 0;
                for (char c : substr.toCharArray()) {
                    if (c == '0') ct0++;
                    if (c == '1') ct1++;
                    if (c == '2') ct2++;
                }
                if (ct0 == ct1 && ct1 == ct2) {
                    ct++;
                }
            }
        }

        return ct;
    }

    public static void main(String[] args) {
        String s = "0102010";
        System.out.println(countSubstrs(s));  
    }

    
}
