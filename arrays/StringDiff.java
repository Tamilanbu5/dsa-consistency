import java.util.*;
public class StringDiff {

    static char Diff(String s1,String s2){

        int total=0;

        for(int i=0;i<s2.length();i++){

            total=total+s2.charAt(i);
        }

        for(int j=0;j<s1.length();j++){

            total=total-s1.charAt(j);
        }

        return (char)total;
    }

    public static void main (String args[]){

        String s1="ram";
        String s2="ramk";

       

        System.out.print(Diff(s1,s2));
    }
    
}
