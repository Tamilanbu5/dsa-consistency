public class indexfirstOccurence {

    static int firstOccur(String haystack, String needle){

        for(int i=0;i<=haystack.length()-needle.length();i++){

            if(haystack.charAt(i)==needle.charAt(0)){

                if(haystack.substring(i,needle.length()+i).equals(needle)){

                    return i;
                }

            }
        }

        return -1;
    }

    public static void main (String args[]){



        String haystack="ramleetcode";
        String needle="leet";

        System.out.print(firstOccur(haystack,needle));
    }


    
}
