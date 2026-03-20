import java.util.*;
class MaximizeToysGFG{
    static int toyCount(int N, int K, int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int max=0;
        
        int left=0;
        
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            
            max+=arr[i];
            
            if(max>K){
                
                return count;
            }
            
            count++;
            
           
            
        }
        
        return arr.length;
    }

    public static void main (String args[]){

        int arr[]={1, 12, 5, 111, 200, 1000, 10};
        int K=50;

        int N=arr.length;

        System.out.print(toyCount(K, K, arr));
    }

}