import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithAtMostTwoDistinctInt {

    static int totalElements(int[] arr) {
        // code here
        int maxLen=0;
        
        Map<Integer,Integer> hash=new HashMap<>();
        
        int left=0;
        
        int right=0;
        
        for(int i=0;i<arr.length;i++){
            

            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
            
            

            while(hash.size()>2){
                
                hash.put(arr[left],hash.get(arr[left])-1);
                
                
                
                
                if(hash.get(arr[left])==0){
                    
                    hash.remove(arr[left]);
                    

                }
                                    left++;

            }
            
            maxLen = Math.max(maxLen, i - left + 1);

            
            
            
        }
        
        return maxLen;
        
    }

    public static void main(String[] args) {

        int arr[]={3, 1, 2, 2, 2, 2};

        System.out.print(totalElements(arr));

        
    }
    
}
