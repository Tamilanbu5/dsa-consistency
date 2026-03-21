function countSubstr(s, k) {
    let n = s.length;
    let ans = 0;

    for (let i = 0; i < n; i++) {

        // array to check if a character 
        // is present in substring i..j
        let map = new Array(26).fill(false);
        let distinctCnt = 0;

        for (let j = i; j < n; j++) {

            // if new character is present,
            // increment distinct count.
            if (!map[s.charCodeAt(j) - 'a'.charCodeAt(0)]) {
                map[s.charCodeAt(j) - 'a'.charCodeAt(0)] = true;
                distinctCnt++;
            }

            // if distinct count is equal to k.
            if (distinctCnt === k) ans++;
        }
    }

    return ans;
}

// Driver Code
let s = "abc";
let k = 2;
console.log(countSubstr(s, k));