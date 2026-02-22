public class ReverseOnlyLetters {

    static String reverseletters(String s){

        int n=s.length();

        char ch[]=s.toCharArray();

        int start=0;

        int end=n-1;

        while(start<end){

            if(!Character.isLetter(ch[start])){

                start++;
            }

            else if(!Character.isLetter(ch[end])){
                end--;
            }

            else{
                  char temp=ch[start];
                  ch[start]=ch[end];
                  ch[end]=temp;
                  start++;
                  end--;
            }
        }

        return new String(ch);
    }

    public static void main (String args[]){

        String s="ab+hu==o";

        System.out.print(reverseletters(s));
    }
    
}
