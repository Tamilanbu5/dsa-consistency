import java.util.*;
public class RotateMatrixby90 {

    static void rotate(int matrix[][]){

        int n=matrix.length;

        for(int i=0;i<n-2;i++){

            for(int j=i+1;j<n;j++){

                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){

            int left=0;
            int right=n-1;

            while(left<right){

                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }

    public static void main (String args[]){

        int matrix[][]={
            {1,2,3},
            {2,3,4},
            {5,4,9}
        };

        rotate(matrix);

        for(int[] row:matrix){

            for(int it:row){

                System.out.print(it+" ");
            }
            System.out.println();

        }
    }
    
}
