import java.util.*;
public class CountSubarraysWithK {

    static int subarrayK(int arr[],int k){

        Map<Integer,Integer> hash=new HashMap<>();

        int count=0;

        int xr=0;
        
        hash.put(0,1);

        for(int t:arr){


             xr^=t;

             int target=xr^k;

            if(hash.containsKey(target)){

                count+=hash.get(target);
            }

            hash.put(xr,hash.getOrDefault(xr, 0)+1);

            
        }

        return count;


    }

    public static void main (String args[]){

        int arr[]={4,2,2,6,4};

        int k=6;

        System.out.print(subarrayK(arr,k));
    }
    
}
