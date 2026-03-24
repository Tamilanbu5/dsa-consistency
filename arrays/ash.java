// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int left=0;
        
        int max=0;
        
        int i=0;
        
        Map<Character,Integer> hash=new HashMap<>();
        
        Map<Character,Integer> mash=new HashMap<>();

        
        for(char ch:pat.toCharArray()){
            
            hash.put(ch,hash.getOrDefault(ch,0)+1);
            
        }
        
        for(int i=0;i<txt.length();i++){
            
            mash.put(txt.charAt(i),mash.getOrDefault(ch,0)+1);
            
            if(i-left+1==pat.length()){
                
                if(mash.equals(hash)){
                 
                 count++;
                
                   }
                   
                 char out = txt.charAt(left);
                hash.put(out, hash.get(out) - 1);
                if (hash.get(out) == 0) hash.remove(out);
                left++;
                   
            }
            
            
            
            
        }
        
        return count;
    }
}