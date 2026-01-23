public class ArrangeBySignOpti {

    static void arrange(int arr[]){

       

        int n=arr.length;

        int ans[]=new int[n];
         int pos=0; 
        int neg=1;

        for(int i=0;i<arr.length;i++){

            if(arr[i]<0){

                ans[neg]=arr[i];
                neg+=2;
            }
            else{

                ans[pos]=arr[i];
                pos+=2;
            }

           
        }
          for(int it:ans){

            System.out.print(it+" ");
        }


    }
    public static void main(String[] args) {
         int arr[]={-3,4,6,-9,5,-1};

    arrange(arr);
    
    }
    
}
