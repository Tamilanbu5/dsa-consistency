import java.util.*;
public class LongestSubSequenceOpti {

    static int sub(int arr[]){

        Set<Integer> set=new HashSet<>();

        int longest=1;

        for(int i=0;i<arr.length;i++){

            set.add(arr[i]);
        }

        for(int it:set){

            if(!set.contains(it-1)){

                int count=1;

                int smallest=it;

                while(set.contains(smallest+1)){
                    smallest+=1;
                    count++;
                }

               longest=Math.max(longest,count);


            }

        }

        return longest;
    }


    public static void main (String args[]){

    int[] arr = {100, 4, 200, 1, 3, 2}; 

    System.out.print(sub(arr));

    }

    
}
