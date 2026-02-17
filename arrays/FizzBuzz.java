import java.util.*;
public class FizzBuzz{

    static List<String> find (int n){

        List<String> list=new ArrayList<>();

        for(int i=1;i<=10;i++){

            if(i%3==0 && i%5==0){

                list.add("FizzBuzz");

            }

            else if(i%3==0){

                list.add("Fizz");
            }

             else if(i%5==0){

                list.add("Buzz");
            }

            else{
                list.add(String.valueOf(i));
            }


        }
        return list;
    }

    public static void main (String args[]){

        int n=10;

        System.out.print(find(n));
    }


}