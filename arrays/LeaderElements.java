import java.util.*;

public class LeaderElements {

    static int[] leader(int arr[]){

        ArrayList<Integer> list=new ArrayList<>();

        int n=arr.length;

        int max=arr[n-1];

        list.add(arr[n-1]);


        for(int i=arr.length-2;i>=0;i--){

            if(arr[i]>max){
                max=arr[i];
                list.add(arr[i]);
            }
        }

        Collections.reverse(list);


        int tak[]=new int[list.size()];

        int i=0;

        for(int it:list){
            tak[i]=it;
            i++;
        }

        return tak;

    }

    public static void main (String args[]){

    int arr[]={2,100,9,42,99,22};

    int ans[]=leader(arr);

    System.out.print(Arrays.toString(ans));

    
}
}
