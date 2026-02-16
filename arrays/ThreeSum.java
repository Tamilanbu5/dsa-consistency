import java.util.*;
public class ThreeSum {

    static List<List<Integer>> check(int arr[]){

        Set<List<Integer>> anss=new HashSet<>();

        int n=arr.length-1;

        for(int i=0;i<n;i++){

            Set<Integer> set=new HashSet<>();

            for(int j=0;j<n;j++){

                int k=-(arr[i]+arr[j]);

                if(set.contains(k)){

                    List<Integer> temp=Arrays.asList(arr[i],arr[j],k);
                    Collections.sort(temp);
                    anss.add(temp);

                }

                set.add(arr[j]);


            }
        }

        return new ArrayList<>(anss);


    }

    public static void main (String args[]){

        int arr[]={-1,0,1,2,-1,-4};

        List<List<Integer>> ans=check(arr);

        for(List<Integer> tip:ans){

            for(int num:tip){

                System.out.print(num+" ");
            }

            System.out.println();
        }

           
        
    }

    
    
}
