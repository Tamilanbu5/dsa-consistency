import java.util.*;

public class subarrayOpti {

    static int sub(int arr[],int k){

        HashMap<Integer,Integer> hash=new HashMap<>();

        int sum=0;

        int maxlen=0;

        for(int i=0;i<arr.length;i++){

            sum=sum+arr[i];

            if(sum==k){

                maxlen=Math.max(i+1,maxlen);
            }

            int rem=sum-k;

            if(hash.containsKey(rem)){

                int len=i-hash.get(rem);

                maxlen=Math.max(len,maxlen);


            }

            if(!hash.containsKey(sum)){

                hash.put(sum,i);
            }


        }



        return maxlen;
    }

    public static void main (String args[]){

    // int arr[]={1,2,3,1,1,1,1,4,2,3};

    int arr[]={2,0,0,3};
    
    Scanner sc=new Scanner(System.in);

    int k=sc.nextInt();

    System.out.print(sub(arr,k));
    }
    
}
