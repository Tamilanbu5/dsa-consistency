public class ReverseString {

    static String Reverse(String s){

        String rev="";

        for(int i=0;i<s.length();i++){
             
            rev=s.charAt(i)+rev;

        }

        return rev;
    }

    public static void main (String args[]){

        String s="Jathin";

        System.out.print(Reverse(s));
    }
    
}
