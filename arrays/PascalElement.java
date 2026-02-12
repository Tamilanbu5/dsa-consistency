public class PascalElement {

    static int ncr(int row,int col){

        int res=1;

        for(int i=0;i<col;i++){

            res=res*(row-i);
            res=res/(i+1);


        }
        return res;
    }

    public static void main(String args[]){

        int r=5;
        int c=4;

        System.out.print(ncr(r-1,c-1));
    }
    
}
