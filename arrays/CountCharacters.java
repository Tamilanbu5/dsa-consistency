public class CountCharacters {

    static int count(String s){

        int count=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)!=' '){

                count++;
            }
        }
        return count;
    }

    public static void main (String args[]){

        String s="god is there";

        System.out.print(count(s));
    }
    
}
