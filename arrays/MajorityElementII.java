import java.util.*;
public class MajorityElementII {

    static List<Integer> majority(int arr[]){

        HashMap<Integer,Integer> hash=new HashMap<>();

        List<Integer> result=new ArrayList<>();

        int n=arr.length;

        int mini=n/3+1;

        for(int i=0;i<arr.length;i++){

            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);

            if(hash.get(arr[i])==mini){

                result.add(arr[i]);


            }
            if(result.size()==2)break;
        }

            
          return result;

        }


    

    public static void main (String[] args){

        int arr[]={11, 33, 33, 11, 33, 11};

        List<Integer>ans=majority(arr);

        for(int it:ans){
            System.out.print(it+" ");
        }

        System.out.println();
    }
    
}
