import java.util.*;

public class FirstNegativeSliding {
     static ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        
        int left=0;
        
        ArrayList<Integer> list=new ArrayList<>();
        
        Map<Integer,Integer> hash=new HashMap<>();
        
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
            
            if(i-left+1==k){
                
                count=hash.size();
                
                list.add(count);
                
                hash.put(arr[left],hash.get(arr[left])-1);
                
                if(hash.get(arr[left])==0){
                    
                    hash.remove(arr[left]);
                }
                
                left++;
                
            }
        }
        
        return list;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 1, 3, 4, 2, 3};

        int k=3;

        System.out.print(countDistinct(arr,k));
    }
}
