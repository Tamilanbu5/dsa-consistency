public class lastwordlength {
    public int lengthOfLastWord(String s) {

        String word=s.trim();

        int n=word.length();

        int count=0;

        for(int i=n-1;i>=0;i--){


            if(word.charAt(i)==' '){

               return count;

            }
                count++;
        }
        return count;
    }
    
}
