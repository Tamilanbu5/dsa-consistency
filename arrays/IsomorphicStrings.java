import java.util.*;

public class IsomorphicStrings {

    static boolean isomorphic(String s1,String s2){

        HashMap<Character,Character> hash=new HashMap<>();

        for(int i=0;i<s1.length();i++){

            if(hash.containsKey(s1.charAt(i))){

                if(!hash.get(s1.charAt(i)).equals(s2.charAt(i))){
                    return false;
                }
            }

                else{

                    if(hash.containsValue(s2.charAt(i))){

                        return false;

                    }



                    hash.put(s1.charAt(i),s2.charAt(i));
                }

            }



        
                    return true;

    }

    public static void main (String args[]){

        String s1="faa";

        String s2="toh";

        System.out.print(isomorphic(s1,s2));
    }
    
}
