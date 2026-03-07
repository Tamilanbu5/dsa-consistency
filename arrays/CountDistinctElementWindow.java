import java.util.*;
public class CountDistinctElementWindow {

     static ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        
        ArrayList<Integer> list=new ArrayList<>();
        
        int left=0;
        
        Map<Integer,Integer> hash=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1); 
            
            if(i-left+1==k){
                
                list.add(hash.size());
                
                hash.put(arr[left],hash.get(arr[left])-1);
                
                if(hash.get(arr[left])==0){
                    
                    hash.remove(arr[left]);
                }
                
                left++;

            }
            
        }
        
        
        return list;
              
    }

    public static void main (String args[]){

        int arr[]={1, 2, 1, 3, 4, 2, 3};

        int k=4;

        System.out.print(countDistinct(arr,k));


    }

}