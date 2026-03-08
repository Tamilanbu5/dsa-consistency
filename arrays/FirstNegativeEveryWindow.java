import java.util.*;
class FirstNegativeEveryWindow {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        
        List<Integer> result=new ArrayList<>();
        
        Queue<Integer> q=new LinkedList<>();
        
        int left=0;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<0){
                
                q.add(arr[i]);
            }
            
            
            if(i-left+1==k){
                
                if(q.isEmpty()){
                    result.add(0);
                }
                
                else result.add(q.peek());
                
                if(!q.isEmpty() &&  arr[left]==q.peek()){
                    
                    q.poll();
                }
                
                
                left++;
                
                
                
                
            }
            
            
             
            
        }
        
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {-8, 2, 3, -6, 10};
        int k = 2;

        System.out.print(firstNegInt(arr, k));
    }
}