public class MajorityElementOpti {

    static int majority(int arr[]){

        int ele=0;

        int count=0;

        for(int i=0;i<arr.length;i++){

            if(count==0){
                count=1;
                ele=arr[i];
            }

            else if(ele==arr[i]){
                count++;

            }

            else{

                count--;
            }
        }

        return ele;
    }

    public static void main (String args[]){

        int arr[]={7,7,7,7,5,5,5,5};

        int ans=majority(arr);

        int count1=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==ans){

                count1++;
            }
        }

        int n=arr.length;

        if(count1>n/2){

            System.out.print(ans);
            return;
            // System.exit(0);
        }

        System.out.print("Not found");

    }
    
}
