public class BalancedString {

    static boolean balance(String s){

        int evenSum=0;

        int oddSum=0;

        for(int i=0;i<s.length();i++){

            if(i%2==0){

                evenSum+=s.charAt(i)-'0';
            }
            else{           
                 oddSum+=s.charAt(i)-'0';
                }

        }

        return evenSum==oddSum;
    }


    public static void main (String args[]){

        String s="1254";

        System.out.print(balance(s));
    }
    
}
