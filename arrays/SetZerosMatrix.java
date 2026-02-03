public class SetZerosMatrix {

    static void setZeros(int matrix[][]){

        int m=matrix.length;//no of columns

        int n=matrix[0].length;//no of rows

        int row[]=new int[m];
        int col[]=new int[n];

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                if(row[i]==1||col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        
    }

    public static void main (String args[]){

        int matrix[][]=
        {
            {1,1,1},
            {1,0,1},
            {1,1,1}

        };

       setZeros(matrix);

       for(int i=0;i<matrix.length;i++){

        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
       }
    }
    
}
