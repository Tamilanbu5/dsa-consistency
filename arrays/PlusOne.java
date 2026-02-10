import java.util.*;
public class PlusOne {
    
    static int[] plus(int arr[]){

        int n=arr.length;

        for(int i=n-1;i>=0;i--){

            if(arr[i]<9){

                 arr[i]++;
                 return arr;
            }
            arr[i]=0;
        }

        int neww[]=new int[n+1];

        neww[0]=1;

        return neww;
    }

    public static void main (String args[]){

        int arr[]={9};

        System.out.print(Arrays.toString(plus(arr)));
    }
    
}
