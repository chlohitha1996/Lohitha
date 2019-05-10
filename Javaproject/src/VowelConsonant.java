import java.util.Scanner;
import java.lang.String;
public class VowelConsonant
{
    public static void main(String[] args)
    {
        String message;
        int marker = 0;
        int length;
        char current;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        message = scan.nextLine();
        length = message.length();
        message = message.toLowerCase();



        for (int count=0; count < length; count++)
        {
            current = message.charAt(marker);
            System.out.print(current);
            if (current == 'a' || current== 'e' || current == 'i'
                    || current == 'o' || current == 'u') {
                System.out.print(":Vowel");
                System.out.println();
            }
            else
            {
                System.out.print(":Consonant");
                System.out.println();
            }

            marker++;
        }

    }
}