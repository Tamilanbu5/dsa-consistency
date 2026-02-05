import java.util.*;
public class Anagram {

    static boolean check(String s1, String s2){

        char arr1[]=s1.toCharArray();

        char arr2[]=s2.toCharArray();

        if(arr1.length!=arr2.length){

            return false;
        }

        else{

            Arrays.sort(arr2);
            Arrays.sort(arr1);
            if(Arrays.equals(arr1,arr2)){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static void main (String args[]){

        String s1="keep";
        String s2="peek";

        check(s1,s2);

        if(check(s1,s2)){
            System.out.print("Anagram");
        }
        else{
            System.out.print("Not Anagram");
        }
    }
    
}
