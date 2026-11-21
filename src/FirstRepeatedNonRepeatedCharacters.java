import java.util.Scanner;

public class FirstRepeatedNonRepeatedCharacters {

    public static void main(String args[])
    {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = sc.nextLine();
        System.out.println("inputString: "+ inputString);

        char firstRepeatedChar = ' ';
        char firstNonRepeatedChar = ' ';

        for(int i=0;i<inputString.length();i++)
        {
            char tempChar = inputString.charAt(i);

            if(tempChar != ' ')
            {
                if(inputString.indexOf(tempChar)== inputString.lastIndexOf(tempChar))
                {
                    if(firstNonRepeatedChar == ' ')
                       firstNonRepeatedChar = tempChar;
                    else
                        firstNonRepeatedChar =tempChar;

                }
                else if(firstRepeatedChar == ' ')
                firstRepeatedChar = tempChar;

                if(firstRepeatedChar !=' ' && firstNonRepeatedChar != ' ')
                    break;
            }
        }



        System.out.println("OUTPUT : ");
        System.out.println("firstRepeatedChar: "+firstRepeatedChar);
        System.out.println("firstNonRepeatedChar: "+firstNonRepeatedChar);








    }
}
