import java.util.Scanner;

public class StringDemo {


    public static void main(String args[])
    {



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.nextLine();
        System.out.println("INPUT IS: "+input);

        int upperCaseLetters=0;
        int lowerCaseLetters=0;
        int digits=0;
        int specialChars=0;

        char character[]= input.toCharArray();

        for(char ch:character)
        {
            if(Character.isUpperCase(ch))
                upperCaseLetters++;
            else if
                (Character.isLowerCase(ch))
                lowerCaseLetters++;
            else if
                (Character.isDigit(ch))
                digits++;
            else
                specialChars++;
        }
        System.out.println("OUTPUT IS: ");
        System.out.println("upperCaseLetters: "+upperCaseLetters);
        System.out.println("lowerCaseLetters: "+lowerCaseLetters);
        System.out.println("digits: "+digits);
        System.out.println("specialChars: "+specialChars);


    }
}
