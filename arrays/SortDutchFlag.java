public class SortDutchFlag {

    static void sort(int arr[]){

        int n=arr.length;

        int low=0;

        int mid=0;

        int high=n-1;

        while(mid<=high){

            if(arr[mid]==0){

                Swap(arr,low,mid);
                low++;
                mid++;
            }

            else if(arr[mid]==1){

                mid++;
            }

            else{

                Swap(arr,mid,high);
                high--;
            }
        }

        
    }

    static void Swap(int arr[],int i,int j){

            int temp=arr[i];

            arr[i]=arr[j];

            arr[j]=temp;

            
        }
        

    public static void main (String args[]){

        int arr[]={2,1,2,0,1,2,2,2,0,0,1};

        sort(arr);

        for(int it:arr){

            System.out.print(it+ " ");
        }
    }
    
}
