import java.util.*;

public class WordPattern {

    static boolean WordPatch(String s, String sent){


        String arr[]=sent.split(" ");

        HashMap<Character,String> hash=new HashMap<>();

        if(s.length()!=arr.length){
            return false;
        }

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            boolean containsKey=hash.containsKey(ch);

            if(hash.containsValue(arr[i]) && !containsKey){
                return false;
            }

            if(containsKey&&!hash.get(ch).equals(arr[i])){
                return false;
            }

            else{

                hash.put(ch,arr[i]);
            }
        }
        return true;
    }

    public static void main (String args[]){

        String s="aabb";

        String sent="dog dog cat cat";

        System.out.print(WordPatch(s,sent));
    }
    
}
