import java.util.*;


class PrefixWord{

    static int prefix(String s, String s2){

        String word[]=s.split(" ");

        for(int i=0;i<word.length;i++){

            if(word[i].startsWith(s2)){
                
                return i+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        
        String s="I am strong and he is str";

        String s2="str";

        System.out.print(prefix(s,s2));


    }
}