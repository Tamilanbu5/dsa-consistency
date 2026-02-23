import java.util.*;
public class CountVowelStrings {

    static int count(String s[],int left, int right){

        int count=0;

        for(int i=left;i<=right;i++){

            char w=s[i].charAt(0);
            char e=s[i].charAt(s[i].length()-1);

            if(w=='a'||w=='e'||w=='i'||w=='o'||w=='u'){
                if(e=='a'||e=='e'||e=='i'||e=='o'||e=='u'){
                    count++;
                }
            }

            
        }
        return count;
    }

    public static void main(String args[]){

        String s[]={"ame","i","porl","elo"};

        int left=0;

        int right=3;

        System.out.print(count(s,left,right));
    }
    
}
