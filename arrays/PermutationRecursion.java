import java.util.*;
public class PermutationRecursion {

    static void recur(int arr[],List<Integer> list,List<List<Integer>> result,boolean hey[]){

        if(list.size()==arr.length){

            result.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0;i<arr.length;i++){

            if(hey[i]) continue;

            hey[i]=true;

            list.add(arr[i]);

            recur(arr,list,result,hey);

            list.remove(list.size()-1);

            hey[i]=false;



        }
    }

    public static void main (String args[]){

        int arr[]={1,2,3};

        ArrayList<Integer> list=new ArrayList<>();

        List<List<Integer>> result=new ArrayList<>();

        boolean[] hey=new boolean[arr.length];

        recur(arr,list,result,hey);

        for(List<Integer> perm:result){
             System.out.println(perm);
        }
    }
    
}
