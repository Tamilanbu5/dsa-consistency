public class StockBuySell {

    static int profit(int arr[]){

        int min=arr[0];

        int profitt=0;

        for(int i=1;i<arr.length;i++){

            int cost=arr[i]-min;

            profitt=Math.max(profitt,cost);

            min=Math.min(min,arr[i]);
 
        }

        return profitt;
    }

    public static void main (String args[]){

        int arr[]={7,1,5,3,6,4};

        System.out.print(profit(arr));
    }
    
}
