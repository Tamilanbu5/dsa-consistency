public class PowerOfTwo {

    static boolean two(int n){

         if(n==0){

            return false;
         }

         while(n/2!=1){

            if(n/2!=0){

                return false;
            }

            else{
                n=n/2;
            }
         }

         return true;


    }

    public static void main (String args[]){

        int n=16;

        System.out.print(two(n));
    }
    
}
