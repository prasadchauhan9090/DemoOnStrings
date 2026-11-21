import java.util.Arrays;
import java.util.Scanner;

public class OddStringWords {

    public static void main(String args[])
    {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = sc.nextLine();
        System.out.println("inputString: "+ inputString);

       String words[] = inputString.split(" ");

       String outputString[]= new String[words.length/2];
       int index=0;

       for(int i=0;i<words.length;i++)
       {
           if(i%2!=0)
           {
               outputString[index] = words[i];
               index=index+1;
           }
       }


       System.out.println("OutputString: "+ Arrays.toString(outputString));
       sc.close();


    }
}
