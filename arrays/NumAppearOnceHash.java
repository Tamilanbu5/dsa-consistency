import java.util.*;

public class NumAppearOnceHash {

    static void appear(int arr[]){

        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int it:arr){

            hash.put(it,hash.getOrDefault(it,0)+1);
        }

        // for(int it:arr){

        //     if(hash.containsKey(it)){
                
        //         hash.put(it,hash.get(it)+1);    
        //     }

        //     else{
        //         hash.put(it,1);
        //     }

        //  }

         for(Map.Entry<Integer,Integer> entry : hash.entrySet()){

            if(entry.getValue()==1){

                System.out.print(entry.getKey());
            }


         }

        

    }


    public static void main (String args[]){

         int[] arr = {1, 1, 2, 1, 2,8};

         appear(arr);
    }
}
   
    

