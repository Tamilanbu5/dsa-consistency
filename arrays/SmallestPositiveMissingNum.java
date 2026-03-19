
class SmallestPositiveMissingNum{

    static int missing(int arr[]){

        int res=1;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==res){
                res++;
            }

            else if(arr[i]>res){

                break;
            }
        }

        return res;


    }


    public static void main (String args[]){

        int arr[]={1,2,5,6};

        System.out.print(missing(arr));


    }
}