public class PalindromeString {

    static void palindrome(String s){

        String rev="";

        for(int i=s.length()-1;i>=0;i--){

            rev+=s.charAt(i);
        }
        if(s.toLowerCase().equals(rev.toLowerCase())){

            System.out.print("Palindrome");

        }

        else{
            System.out.print("Not Palindrome");
        }
    }

    public static void main(String args[]){

        String s="radar";

        palindrome(s);
    }
    
}
