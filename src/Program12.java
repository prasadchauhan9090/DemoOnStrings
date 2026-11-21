import java.util.Locale;
import java.util.Scanner;

public class Program12 {


    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String inputString1 = sc.nextLine();
        System.out.println("inputString: "+ inputString1);


        System.out.println("Enter second string");
        String inputString2 = sc.nextLine();
        System.out.println("inputString: "+ inputString2);

        String output="";
        for(int i=0;i<inputString1.length();i++)
        {
            char tempChar=inputString1.toLowerCase().charAt(i);

            if(inputString2.toLowerCase().indexOf(tempChar)>=0)
               output=output+ inputString1.charAt(i);
            else
                output=output+'+';

        }

        System.out.println("OUTPUT"+ output);











    }
}
