import java.util.*;

public class MissingNumberOptiXOR {

    static int missing(int arr[],int N){

        int xor1=0; 
        
        int xor2=0;

        for(int i=0;i<N-1;i++){

            xor2^=arr[i];
            xor1^=(i+1);

           
        }

         xor1^=N;

         return xor2^xor1;

    }

    public static void main(String args[]){

        int arr[]={1,2,4,5};

        int N=5;

        System.out.print(missing(arr,N));
    }
    
}
