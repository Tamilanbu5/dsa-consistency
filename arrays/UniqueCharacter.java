public class UniqueCharacter {

    static int unique(String s){

        char a[]=s.toCharArray();

        int freq[]=new int[26];

        for(char p:a){

            freq[p-'a']++;
        }

        for(int i=0;i<a.length;i++){

            if(freq[a[i]-'a']==1){

                return i;

            }


        }

        return -1;
    }

    public static void main (String args[]){

        String s="leetlcode";

        System.out.print(unique(s));
    }
    
}
